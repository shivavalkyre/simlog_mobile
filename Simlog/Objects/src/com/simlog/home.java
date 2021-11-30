package com.simlog;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class home extends Activity implements B4AActivity{
	public static home mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.simlog", "com.simlog.home");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (home).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.simlog", "com.simlog.home");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.simlog.home", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (home) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (home) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return home.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (home) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (home) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            home mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (home) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public com.simlog.b4xdrawer _drawer = null;
public b4a.example3.customlistview _clvsidebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel6 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel7 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel8 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview5 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview6 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview7 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview10 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview11 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview12 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scvdashboard = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearchdashboard = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webchart = null;
public com.simlog.clsgooglechart _clsgooglechart = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webchart1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlchartbonpermintaan = null;
public b4a.example3.customlistview _clvbarangexisting = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmainbarangexisting = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnamabarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkodebarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkategoribarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnilaibarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltahunpengadaan = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsatuanbarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmerkbarang = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbottommenu = null;
public anywheresoftware.b4a.objects.LabelWrapper _imageviewbottommenu3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkondisibarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelusiasimpanbarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelstockminimum = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelstockbarang = null;
public com.simlog.main _main = null;
public com.simlog.starter _starter = null;
public com.simlog.general _general = null;
public com.simlog.register _register = null;
public com.simlog.login _login = null;
public com.simlog.forgotpasswoord _forgotpasswoord = null;
public com.simlog.newbarangexisting _newbarangexisting = null;
public com.simlog.permintaanbarang _permintaanbarang = null;
public com.simlog.listpermintaanbarang _listpermintaanbarang = null;
public com.simlog.pengadaanbarang _pengadaanbarang = null;
public com.simlog.trackingstatus _trackingstatus = null;
public com.simlog.httputils2service _httputils2service = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
int _i = 0;
 //BA.debugLineNum = 70;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 73;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Activity, 280dip)";
mostCurrent._drawer._initialize /*String*/ (mostCurrent.activityBA,home.getObject(),"Drawer",(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (280)));
 //BA.debugLineNum = 74;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"LayoutMenu\")";
mostCurrent._drawer._getcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("LayoutMenu",mostCurrent.activityBA);
 //BA.debugLineNum = 75;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"LayoutDrawer\")";
mostCurrent._drawer._getleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("LayoutDrawer",mostCurrent.activityBA);
 //BA.debugLineNum = 76;BA.debugLine="Dim i As Int =0";
_i = (int) (0);
 //BA.debugLineNum = 77;BA.debugLine="CLVSidebar.Add(CreateListItem(CLVSidebar.AsView.W";
mostCurrent._clvsidebar._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitem(mostCurrent._clvsidebar._asview().getWidth(),mostCurrent._clvsidebar._asview().getHeight()).getObject())),(Object)(_i));
 //BA.debugLineNum = 79;BA.debugLine="Panel1.Color=Colors.RGB(88,99,255)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 80;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home_white.png").getObject()));
 //BA.debugLineNum = 81;BA.debugLine="Label1.TextColor=Colors.White";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 83;BA.debugLine="scvDashboard.Panel.LoadLayout(\"LayoutISIDashboard";
mostCurrent._scvdashboard.getPanel().LoadLayout("LayoutISIDashboard",mostCurrent.activityBA);
 //BA.debugLineNum = 84;BA.debugLine="scvDashboard.panel.Height=PnlChartBONPermintaan.T";
mostCurrent._scvdashboard.getPanel().setHeight((int) (mostCurrent._pnlchartbonpermintaan.getTop()+mostCurrent._pnlchartbonpermintaan.getHeight()));
 //BA.debugLineNum = 85;BA.debugLine="general.SetBackgroundTintList(txtSearchDashboard,";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtsearchdashboard.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 86;BA.debugLine="clsGoogleChart.Initialize";
mostCurrent._clsgooglechart._initialize /*String*/ (processBA);
 //BA.debugLineNum = 87;BA.debugLine="PanelMainBarangExisting.Visible=False";
mostCurrent._panelmainbarangexisting.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 88;BA.debugLine="AnyChart(clsGoogleChart.ChartTypeEnum.ColumnChart";
_anychart(mostCurrent._clsgooglechart._charttypeenum /*com.simlog.clsgooglechart._chartstype*/ .ColumnChart /*String*/ );
 //BA.debugLineNum = 89;BA.debugLine="FillDataBarang";
_filldatabarang();
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _anychart(String _scharttype) throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Sub AnyChart(sChartType As String)";
 //BA.debugLineNum = 542;BA.debugLine="clsGoogleChart.Initialize";
mostCurrent._clsgooglechart._initialize /*String*/ (processBA);
 //BA.debugLineNum = 543;BA.debugLine="clsGoogleChart.Title = \"Company Performance\"";
mostCurrent._clsgooglechart._title /*String*/  = "Company Performance";
 //BA.debugLineNum = 544;BA.debugLine="clsGoogleChart.Width = 400";
mostCurrent._clsgooglechart._width /*String*/  = BA.NumberToString(400);
 //BA.debugLineNum = 545;BA.debugLine="clsGoogleChart.Height = 300";
mostCurrent._clsgooglechart._height /*String*/  = BA.NumberToString(300);
 //BA.debugLineNum = 546;BA.debugLine="clsGoogleChart.YAxis = \"Year\"";
mostCurrent._clsgooglechart._yaxis /*String*/  = "Year";
 //BA.debugLineNum = 547;BA.debugLine="clsGoogleChart.XAxis = \"Values\"";
mostCurrent._clsgooglechart._xaxis /*String*/  = "Values";
 //BA.debugLineNum = 550;BA.debugLine="clsGoogleChart.AddColumn(\"Year\", clsGoogleChart.D";
mostCurrent._clsgooglechart._addcolumn /*String*/ ("Year",mostCurrent._clsgooglechart._dt_string /*String*/ );
 //BA.debugLineNum = 551;BA.debugLine="clsGoogleChart.AddColumn(\"Sales\", clsGoogleChart.";
mostCurrent._clsgooglechart._addcolumn /*String*/ ("Sales",mostCurrent._clsgooglechart._dt_number /*String*/ );
 //BA.debugLineNum = 552;BA.debugLine="clsGoogleChart.AddColumn(\"Expenses\", clsGoogleCha";
mostCurrent._clsgooglechart._addcolumn /*String*/ ("Expenses",mostCurrent._clsgooglechart._dt_number /*String*/ );
 //BA.debugLineNum = 553;BA.debugLine="clsGoogleChart.AddXYY(\"2004\", \"1000\", \"400\")";
mostCurrent._clsgooglechart._addxyy /*String*/ ((Object)("2004"),(Object)("1000"),(Object)("400"));
 //BA.debugLineNum = 554;BA.debugLine="clsGoogleChart.AddXYY(\"2005\", \"1170\", \"460\")";
mostCurrent._clsgooglechart._addxyy /*String*/ ((Object)("2005"),(Object)("1170"),(Object)("460"));
 //BA.debugLineNum = 555;BA.debugLine="clsGoogleChart.AddXYY(\"2006\", \"660\", \"1120\")";
mostCurrent._clsgooglechart._addxyy /*String*/ ((Object)("2006"),(Object)("660"),(Object)("1120"));
 //BA.debugLineNum = 556;BA.debugLine="clsGoogleChart.addxyy(\"2007\", \"1030\",\" 540\")";
mostCurrent._clsgooglechart._addxyy /*String*/ ((Object)("2007"),(Object)("1030"),(Object)(" 540"));
 //BA.debugLineNum = 558;BA.debugLine="clsGoogleChart.Legendposition = clsGoogleChart.Le";
mostCurrent._clsgooglechart._legendposition /*String*/  = mostCurrent._clsgooglechart._legendpositionenum /*com.simlog.clsgooglechart._legendpositiontype*/ .Top /*String*/ ;
 //BA.debugLineNum = 559;BA.debugLine="clsGoogleChart.BackgroundColor = \"white\"";
mostCurrent._clsgooglechart._backgroundcolor /*String*/  = "white";
 //BA.debugLineNum = 560;BA.debugLine="clsGoogleChart.enableInteractivity = True";
mostCurrent._clsgooglechart._enableinteractivity /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 561;BA.debugLine="clsGoogleChart.Animate = True";
mostCurrent._clsgooglechart._animate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 562;BA.debugLine="clsGoogleChart.hAxisslantedText = True";
mostCurrent._clsgooglechart._haxisslantedtext /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 563;BA.debugLine="clsGoogleChart.hAxisslantedTextAngle = 90";
mostCurrent._clsgooglechart._haxisslantedtextangle /*int*/  = (int) (90);
 //BA.debugLineNum = 564;BA.debugLine="clsGoogleChart.SeriesColorsSet(\"Expenses\", \"pink\"";
mostCurrent._clsgooglechart._seriescolorsset /*String*/ ("Expenses","pink");
 //BA.debugLineNum = 565;BA.debugLine="clsGoogleChart.SaveToo = True";
mostCurrent._clsgooglechart._savetoo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 566;BA.debugLine="clsGoogleChart.isStacked = True";
mostCurrent._clsgooglechart._isstacked /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 567;BA.debugLine="clsGoogleChart.ChartType = sChartType";
mostCurrent._clsgooglechart._charttype /*String*/  = _scharttype;
 //BA.debugLineNum = 568;BA.debugLine="clsGoogleChart.DrawChart(webChart)";
mostCurrent._clsgooglechart._drawchart /*String*/ (mostCurrent._webchart);
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(int _width,int _height) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub CreateListItem(Width As Int, Height As Int) As";
 //BA.debugLineNum = 101;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 102;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 103;BA.debugLine="p.SetLayout(0, 0, Width, Height)";
_p.SetLayout((int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 104;BA.debugLine="p.LoadLayout(\"LayoutISISidebar\")";
_p.LoadLayout("LayoutISISidebar",mostCurrent.activityBA);
 //BA.debugLineNum = 105;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitembarang(int _width,int _height,String _nama_barang,String _kd_barang,String _kategori_barang,String _tahun_pengadaan,String _nilai_barang,String _satuan,String _merk,String _kondisi,String _usia_simpan,String _stock_minimum,String _stock) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 583;BA.debugLine="Sub CreateListItemBarang(Width As Int, Height As I";
 //BA.debugLineNum = 584;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 585;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 586;BA.debugLine="p.SetLayout(0, 0, Width, 400dip)";
_p.SetLayout((int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (400)));
 //BA.debugLineNum = 587;BA.debugLine="p.LoadLayout(\"LayoutISICLVBarangExisting\")";
_p.LoadLayout("LayoutISICLVBarangExisting",mostCurrent.activityBA);
 //BA.debugLineNum = 588;BA.debugLine="LabelNamaBarang.Text = nama_barang";
mostCurrent._labelnamabarang.setText(BA.ObjectToCharSequence(_nama_barang));
 //BA.debugLineNum = 589;BA.debugLine="LabelKodeBarang.Text = kd_barang";
mostCurrent._labelkodebarang.setText(BA.ObjectToCharSequence(_kd_barang));
 //BA.debugLineNum = 590;BA.debugLine="LabelKategoriBarang.Text=kategori_barang";
mostCurrent._labelkategoribarang.setText(BA.ObjectToCharSequence(_kategori_barang));
 //BA.debugLineNum = 591;BA.debugLine="LabelTahunPengadaan.Text=tahun_pengadaan";
mostCurrent._labeltahunpengadaan.setText(BA.ObjectToCharSequence(_tahun_pengadaan));
 //BA.debugLineNum = 592;BA.debugLine="LabelNilaiBarang.Text= nilai_barang";
mostCurrent._labelnilaibarang.setText(BA.ObjectToCharSequence(_nilai_barang));
 //BA.debugLineNum = 593;BA.debugLine="LabelSatuanBarang.Text = satuan";
mostCurrent._labelsatuanbarang.setText(BA.ObjectToCharSequence(_satuan));
 //BA.debugLineNum = 594;BA.debugLine="LabelMerkBarang.Text = merk";
mostCurrent._labelmerkbarang.setText(BA.ObjectToCharSequence(_merk));
 //BA.debugLineNum = 595;BA.debugLine="LabelKondisiBarang.Text= kondisi";
mostCurrent._labelkondisibarang.setText(BA.ObjectToCharSequence(_kondisi));
 //BA.debugLineNum = 596;BA.debugLine="LabelUsiaSimpanBarang.Text = usia_simpan";
mostCurrent._labelusiasimpanbarang.setText(BA.ObjectToCharSequence(_usia_simpan));
 //BA.debugLineNum = 597;BA.debugLine="LabelStockMinimum.Text=stock_minimum";
mostCurrent._labelstockminimum.setText(BA.ObjectToCharSequence(_stock_minimum));
 //BA.debugLineNum = 598;BA.debugLine="LabelStockBarang.Text = stock";
mostCurrent._labelstockbarang.setText(BA.ObjectToCharSequence(_stock));
 //BA.debugLineNum = 606;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public static String  _filldatabarang() throws Exception{
int _i = 0;
 //BA.debugLineNum = 576;BA.debugLine="Sub FillDataBarang";
 //BA.debugLineNum = 577;BA.debugLine="For i = 0 To 10";
{
final int step1 = 1;
final int limit1 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 578;BA.debugLine="clvBarangExisting.Add(CreateListItemBarang(clvBa";
mostCurrent._clvbarangexisting._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitembarang(mostCurrent._clvbarangexisting._asview().getWidth(),mostCurrent._clvbarangexisting._asview().getHeight(),"nama barang"+BA.NumberToString(_i),"kd barang"+BA.NumberToString(_i),"kategori_barang "+BA.NumberToString(_i),"tahun pengadaan "+BA.NumberToString(_i),"nilai "+BA.NumberToString(_i),"satuan "+BA.NumberToString(_i),"merk "+BA.NumberToString(_i),"kondisi "+BA.NumberToString(_i),"usia simpan "+BA.NumberToString(_i),"10","10").getObject())),(Object)(_i));
 }
};
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private Drawer As B4XDrawer";
mostCurrent._drawer = new com.simlog.b4xdrawer();
 //BA.debugLineNum = 16;BA.debugLine="Private CLVSidebar As CustomListView";
mostCurrent._clvsidebar = new b4a.example3.customlistview();
 //BA.debugLineNum = 17;BA.debugLine="Private Label1 As Label";
mostCurrent._label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Label2 As Label";
mostCurrent._label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private Label3 As Label";
mostCurrent._label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Label4 As Label";
mostCurrent._label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Label5 As Label";
mostCurrent._label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Label6 As Label";
mostCurrent._label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Label7 As Label";
mostCurrent._label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Label8 As Label";
mostCurrent._label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Panel2 As Panel";
mostCurrent._panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Panel3 As Panel";
mostCurrent._panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Panel4 As Panel";
mostCurrent._panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Panel5 As Panel";
mostCurrent._panel5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Panel6 As Panel";
mostCurrent._panel6 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Panel7 As Panel";
mostCurrent._panel7 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Panel8 As Panel";
mostCurrent._panel8 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private ImageView1 As ImageView";
mostCurrent._imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private ImageView2 As ImageView";
mostCurrent._imageview2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private ImageView3 As ImageView";
mostCurrent._imageview3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private ImageView4 As ImageView";
mostCurrent._imageview4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private ImageView5 As ImageView";
mostCurrent._imageview5 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private ImageView6 As ImageView";
mostCurrent._imageview6 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private ImageView7 As ImageView";
mostCurrent._imageview7 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private ImageView8 As ImageView";
mostCurrent._imageview8 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Label12 As Label";
mostCurrent._label12 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private Label13 As Label";
mostCurrent._label13 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Label14 As Label";
mostCurrent._label14 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private ImageView10 As ImageView";
mostCurrent._imageview10 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private ImageView11 As ImageView";
mostCurrent._imageview11 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private ImageView12 As ImageView";
mostCurrent._imageview12 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private scvDashboard As ScrollView";
mostCurrent._scvdashboard = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private txtSearchDashboard As EditText";
mostCurrent._txtsearchdashboard = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private webChart As WebView";
mostCurrent._webchart = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private clsGoogleChart As clsGoogleChart";
mostCurrent._clsgooglechart = new com.simlog.clsgooglechart();
 //BA.debugLineNum = 51;BA.debugLine="Private webChart1 As WebView";
mostCurrent._webchart1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private PnlChartBONPermintaan As Panel";
mostCurrent._pnlchartbonpermintaan = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private clvBarangExisting As CustomListView";
mostCurrent._clvbarangexisting = new b4a.example3.customlistview();
 //BA.debugLineNum = 54;BA.debugLine="Private PanelMainBarangExisting As Panel";
mostCurrent._panelmainbarangexisting = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private LabelNamaBarang As Label";
mostCurrent._labelnamabarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private LabelKodeBarang As Label";
mostCurrent._labelkodebarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private LabelKategoriBarang As Label";
mostCurrent._labelkategoribarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private LabelNilaiBarang As Label";
mostCurrent._labelnilaibarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private LabelTahunPengadaan As Label";
mostCurrent._labeltahunpengadaan = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private LabelSatuanBarang As Label";
mostCurrent._labelsatuanbarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private LabelMerkBarang As Label";
mostCurrent._labelmerkbarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private PanelBottomMenu As Panel";
mostCurrent._panelbottommenu = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private ImageViewBottomMenu3 As Label";
mostCurrent._imageviewbottommenu3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private LabelKondisiBarang As Label";
mostCurrent._labelkondisibarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private LabelUsiaSimpanBarang As Label";
mostCurrent._labelusiasimpanbarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Private LabelStockMinimum As Label";
mostCurrent._labelstockminimum = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Private LabelStockBarang As Label";
mostCurrent._labelstockbarang = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _imageviewbottommenu3_click() throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Private Sub ImageViewBottomMenu3_Click";
 //BA.debugLineNum = 616;BA.debugLine="If general.current_position=2 Then";
if (mostCurrent._general._current_position /*int*/ ==2) { 
 //BA.debugLineNum = 617;BA.debugLine="StartActivity(NewBarangExisting)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._newbarangexisting.getObject()));
 };
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return "";
}
public static String  _label1_click() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Private Sub Label1_Click";
 //BA.debugLineNum = 109;BA.debugLine="Panel1.Color=Colors.RGB(88,99,255)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 110;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home_white.png").getObject()));
 //BA.debugLineNum = 111;BA.debugLine="Label1.TextColor=Colors.White";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 113;BA.debugLine="Panel2.Color=Colors.RGB(152,159,254)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 114;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExisting.png").getObject()));
 //BA.debugLineNum = 115;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 117;BA.debugLine="Panel3.Color=Colors.RGB(152,159,254)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 118;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarang.png").getObject()));
 //BA.debugLineNum = 119;BA.debugLine="Label3.TextColor=Colors.Black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 121;BA.debugLine="Panel4.Color=Colors.RGB(152,159,254)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 122;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarang.png").getObject()));
 //BA.debugLineNum = 123;BA.debugLine="Label4.TextColor=Colors.black";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 125;BA.debugLine="Panel5.Color=Colors.RGB(152,159,254)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 126;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatus.png").getObject()));
 //BA.debugLineNum = 127;BA.debugLine="Label5.TextColor=Colors.black";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 129;BA.debugLine="Panel6.Color=Colors.RGB(152,159,254)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 130;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasi.png").getObject()));
 //BA.debugLineNum = 131;BA.debugLine="Label6.TextColor=Colors.Black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 133;BA.debugLine="Panel7.Color=Colors.RGB(152,159,254)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 134;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuser.png").getObject()));
 //BA.debugLineNum = 135;BA.debugLine="Label7.TextColor=Colors.Black";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 137;BA.debugLine="Panel8.Color=Colors.RGB(152,159,254)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 138;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografis.png").getObject()));
 //BA.debugLineNum = 139;BA.debugLine="Label8.TextColor=Colors.black";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 141;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 142;BA.debugLine="Label12.TextColor=Colors.Black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 145;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 146;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 148;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 149;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 154;BA.debugLine="PanelMainBarangExisting.Visible=False";
mostCurrent._panelmainbarangexisting.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 155;BA.debugLine="scvDashboard.Visible=True";
mostCurrent._scvdashboard.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 157;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 158;BA.debugLine="general.current_position =1";
mostCurrent._general._current_position /*int*/  = (int) (1);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public static String  _label12_click() throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Private Sub Label12_Click";
 //BA.debugLineNum = 492;BA.debugLine="Label3_Click";
_label3_click();
 //BA.debugLineNum = 493;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventariswhite.png").getObject()));
 //BA.debugLineNum = 494;BA.debugLine="Label12.TextColor=Colors.white";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 496;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 497;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 499;BA.debugLine="general.permintaan_barang_type=53";
mostCurrent._general._permintaan_barang_type /*int*/  = (int) (53);
 //BA.debugLineNum = 502;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 503;BA.debugLine="StartActivity(PermintaanBarang)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._permintaanbarang.getObject()));
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return "";
}
public static String  _label13_click() throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Private Sub Label13_Click";
 //BA.debugLineNum = 507;BA.debugLine="Label3_Click";
_label3_click();
 //BA.debugLineNum = 508;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 509;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 511;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventariswhite.png").getObject()));
 //BA.debugLineNum = 512;BA.debugLine="Label13.TextColor=Colors.white";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 514;BA.debugLine="general.permintaan_barang_type=52";
mostCurrent._general._permintaan_barang_type /*int*/  = (int) (52);
 //BA.debugLineNum = 518;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 519;BA.debugLine="StartActivity(PermintaanBarang)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._permintaanbarang.getObject()));
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return "";
}
public static String  _label14_click() throws Exception{
 //BA.debugLineNum = 523;BA.debugLine="Private Sub Label14_Click";
 //BA.debugLineNum = 524;BA.debugLine="Label3_Click";
_label3_click();
 //BA.debugLineNum = 525;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 526;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 528;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 529;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 534;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return "";
}
public static String  _label2_click() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Private Sub Label2_Click";
 //BA.debugLineNum = 163;BA.debugLine="Panel1.Color=Colors.RGB(152,159,254)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 164;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 165;BA.debugLine="Label1.TextColor=Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 167;BA.debugLine="Panel2.Color=Colors.RGB(88,99,255)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 168;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExistingWhite.png").getObject()));
 //BA.debugLineNum = 169;BA.debugLine="Label2.TextColor=Colors.White";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 171;BA.debugLine="Panel3.Color=Colors.RGB(152,159,254)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 172;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarang.png").getObject()));
 //BA.debugLineNum = 173;BA.debugLine="Label3.TextColor=Colors.Black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 175;BA.debugLine="Panel4.Color=Colors.RGB(152,159,254)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 176;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarang.png").getObject()));
 //BA.debugLineNum = 177;BA.debugLine="Label4.TextColor=Colors.black";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 179;BA.debugLine="Panel5.Color=Colors.RGB(152,159,254)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 180;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatus.png").getObject()));
 //BA.debugLineNum = 181;BA.debugLine="Label5.TextColor=Colors.black";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 183;BA.debugLine="Panel6.Color=Colors.RGB(152,159,254)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 184;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasi.png").getObject()));
 //BA.debugLineNum = 185;BA.debugLine="Label6.TextColor=Colors.Black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 187;BA.debugLine="Panel7.Color=Colors.RGB(152,159,254)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 188;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuser.png").getObject()));
 //BA.debugLineNum = 189;BA.debugLine="Label7.TextColor=Colors.Black";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 191;BA.debugLine="Panel8.Color=Colors.RGB(152,159,254)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 192;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografis.png").getObject()));
 //BA.debugLineNum = 193;BA.debugLine="Label8.TextColor=Colors.black";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 195;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 196;BA.debugLine="Label12.TextColor=Colors.Black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 199;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 200;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 202;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 203;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 208;BA.debugLine="PanelMainBarangExisting.Visible=True";
mostCurrent._panelmainbarangexisting.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 209;BA.debugLine="scvDashboard.Visible=False";
mostCurrent._scvdashboard.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 210;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 211;BA.debugLine="general.current_position =2";
mostCurrent._general._current_position /*int*/  = (int) (2);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public static String  _label3_click() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Private Sub Label3_Click";
 //BA.debugLineNum = 215;BA.debugLine="Panel1.Color=Colors.RGB(152,159,254)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 216;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 217;BA.debugLine="Label1.TextColor=Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 219;BA.debugLine="Panel2.Color=Colors.RGB(152,159,254)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 220;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExisting.png").getObject()));
 //BA.debugLineNum = 221;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 223;BA.debugLine="Panel3.Color=Colors.RGB(88,99,255)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 224;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarangWhite.png").getObject()));
 //BA.debugLineNum = 225;BA.debugLine="Label3.TextColor=Colors.white";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 227;BA.debugLine="Panel4.Color=Colors.RGB(152,159,254)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 228;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarang.png").getObject()));
 //BA.debugLineNum = 229;BA.debugLine="Label4.TextColor=Colors.black";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 231;BA.debugLine="Panel5.Color=Colors.RGB(152,159,254)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 232;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatus.png").getObject()));
 //BA.debugLineNum = 233;BA.debugLine="Label5.TextColor=Colors.black";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 235;BA.debugLine="Panel6.Color=Colors.RGB(152,159,254)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 236;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasi.png").getObject()));
 //BA.debugLineNum = 237;BA.debugLine="Label6.TextColor=Colors.Black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 239;BA.debugLine="Panel7.Color=Colors.RGB(152,159,254)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 240;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuser.png").getObject()));
 //BA.debugLineNum = 241;BA.debugLine="Label7.TextColor=Colors.Black";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 243;BA.debugLine="Panel8.Color=Colors.RGB(152,159,254)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 244;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografis.png").getObject()));
 //BA.debugLineNum = 245;BA.debugLine="Label8.TextColor=Colors.black";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 247;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 248;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 250;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 251;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 256;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public static String  _label4_click() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Private Sub Label4_Click";
 //BA.debugLineNum = 261;BA.debugLine="Panel1.Color=Colors.RGB(152,159,254)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 262;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 263;BA.debugLine="Label1.TextColor=Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 265;BA.debugLine="Panel2.Color=Colors.RGB(152,159,254)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 266;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExisting.png").getObject()));
 //BA.debugLineNum = 267;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 269;BA.debugLine="Panel3.Color=Colors.RGB(152,159,254)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 270;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarang.png").getObject()));
 //BA.debugLineNum = 271;BA.debugLine="Label3.TextColor=Colors.black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 273;BA.debugLine="Panel4.Color=Colors.RGB(88,99,255)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 274;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarangwhite.png").getObject()));
 //BA.debugLineNum = 275;BA.debugLine="Label4.TextColor=Colors.white";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 277;BA.debugLine="Panel5.Color=Colors.RGB(152,159,254)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 278;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatus.png").getObject()));
 //BA.debugLineNum = 279;BA.debugLine="Label5.TextColor=Colors.black";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 281;BA.debugLine="Panel6.Color=Colors.RGB(152,159,254)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 282;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasi.png").getObject()));
 //BA.debugLineNum = 283;BA.debugLine="Label6.TextColor=Colors.Black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 285;BA.debugLine="Panel7.Color=Colors.RGB(152,159,254)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 286;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuser.png").getObject()));
 //BA.debugLineNum = 287;BA.debugLine="Label7.TextColor=Colors.Black";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 289;BA.debugLine="Panel8.Color=Colors.RGB(152,159,254)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 290;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografis.png").getObject()));
 //BA.debugLineNum = 291;BA.debugLine="Label8.TextColor=Colors.black";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 293;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 294;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 296;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 297;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 302;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 303;BA.debugLine="StartActivity(PengadaanBarang)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._pengadaanbarang.getObject()));
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public static String  _label5_click() throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Private Sub Label5_Click";
 //BA.debugLineNum = 307;BA.debugLine="Panel1.Color=Colors.RGB(152,159,254)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 308;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 309;BA.debugLine="Label1.TextColor=Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 311;BA.debugLine="Panel2.Color=Colors.RGB(152,159,254)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 312;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExisting.png").getObject()));
 //BA.debugLineNum = 313;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 315;BA.debugLine="Panel3.Color=Colors.RGB(152,159,254)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 316;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarang.png").getObject()));
 //BA.debugLineNum = 317;BA.debugLine="Label3.TextColor=Colors.black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 319;BA.debugLine="Panel4.Color=Colors.RGB(152,159,254)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 320;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarang.png").getObject()));
 //BA.debugLineNum = 321;BA.debugLine="Label4.TextColor=Colors.black";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 323;BA.debugLine="Panel5.Color=Colors.RGB(88,99,255)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 324;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatuswhite.png").getObject()));
 //BA.debugLineNum = 325;BA.debugLine="Label5.TextColor=Colors.White";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 327;BA.debugLine="Panel6.Color=Colors.RGB(152,159,254)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 328;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasi.png").getObject()));
 //BA.debugLineNum = 329;BA.debugLine="Label6.TextColor=Colors.Black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 331;BA.debugLine="Panel7.Color=Colors.RGB(152,159,254)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 332;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuser.png").getObject()));
 //BA.debugLineNum = 333;BA.debugLine="Label7.TextColor=Colors.Black";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 335;BA.debugLine="Panel8.Color=Colors.RGB(152,159,254)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 336;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografis.png").getObject()));
 //BA.debugLineNum = 337;BA.debugLine="Label8.TextColor=Colors.black";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 339;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 340;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 342;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 343;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 348;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 349;BA.debugLine="StartActivity(TrackingStatus)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._trackingstatus.getObject()));
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return "";
}
public static String  _label6_click() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Private Sub Label6_Click";
 //BA.debugLineNum = 353;BA.debugLine="Panel1.Color=Colors.RGB(152,159,254)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 354;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 355;BA.debugLine="Label1.TextColor=Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 357;BA.debugLine="Panel2.Color=Colors.RGB(152,159,254)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 358;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExisting.png").getObject()));
 //BA.debugLineNum = 359;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 361;BA.debugLine="Panel3.Color=Colors.RGB(152,159,254)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 362;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarang.png").getObject()));
 //BA.debugLineNum = 363;BA.debugLine="Label3.TextColor=Colors.black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 365;BA.debugLine="Panel4.Color=Colors.RGB(152,159,254)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 366;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarang.png").getObject()));
 //BA.debugLineNum = 367;BA.debugLine="Label4.TextColor=Colors.black";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 369;BA.debugLine="Panel5.Color=Colors.RGB(152,159,254)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 370;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatus.png").getObject()));
 //BA.debugLineNum = 371;BA.debugLine="Label5.TextColor=Colors.Black";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 373;BA.debugLine="Panel6.Color=Colors.RGB(88,99,255)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 374;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasiwhite.png").getObject()));
 //BA.debugLineNum = 375;BA.debugLine="Label6.TextColor=Colors.white";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 377;BA.debugLine="Panel7.Color=Colors.RGB(152,159,254)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 378;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuser.png").getObject()));
 //BA.debugLineNum = 379;BA.debugLine="Label7.TextColor=Colors.Black";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 381;BA.debugLine="Panel8.Color=Colors.RGB(152,159,254)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 382;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografis.png").getObject()));
 //BA.debugLineNum = 383;BA.debugLine="Label8.TextColor=Colors.black";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 385;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 386;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 388;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 389;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 394;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public static String  _label7_click() throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Private Sub Label7_Click";
 //BA.debugLineNum = 398;BA.debugLine="Panel1.Color=Colors.RGB(152,159,254)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 399;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 400;BA.debugLine="Label1.TextColor=Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 402;BA.debugLine="Panel2.Color=Colors.RGB(152,159,254)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 403;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExisting.png").getObject()));
 //BA.debugLineNum = 404;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 406;BA.debugLine="Panel3.Color=Colors.RGB(152,159,254)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 407;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarang.png").getObject()));
 //BA.debugLineNum = 408;BA.debugLine="Label3.TextColor=Colors.black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 410;BA.debugLine="Panel4.Color=Colors.RGB(152,159,254)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 411;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarang.png").getObject()));
 //BA.debugLineNum = 412;BA.debugLine="Label4.TextColor=Colors.black";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 414;BA.debugLine="Panel5.Color=Colors.RGB(152,159,254)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 415;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatus.png").getObject()));
 //BA.debugLineNum = 416;BA.debugLine="Label5.TextColor=Colors.Black";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 418;BA.debugLine="Panel6.Color=Colors.RGB(152,159,254)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 419;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasi.png").getObject()));
 //BA.debugLineNum = 420;BA.debugLine="Label6.TextColor=Colors.black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 422;BA.debugLine="Panel7.Color=Colors.RGB(88,99,255)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 423;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuserwhite.png").getObject()));
 //BA.debugLineNum = 424;BA.debugLine="Label7.TextColor=Colors.white";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 426;BA.debugLine="Panel8.Color=Colors.RGB(152,159,254)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 427;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografis.png").getObject()));
 //BA.debugLineNum = 428;BA.debugLine="Label8.TextColor=Colors.black";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 430;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 431;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 433;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 434;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 439;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return "";
}
public static String  _label8_click() throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Private Sub Label8_Click";
 //BA.debugLineNum = 444;BA.debugLine="Panel1.Color=Colors.RGB(152,159,254)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 445;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,\"ho";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 446;BA.debugLine="Label1.TextColor=Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 448;BA.debugLine="Panel2.Color=Colors.RGB(152,159,254)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 449;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"Ba";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"BarangExisting.png").getObject()));
 //BA.debugLineNum = 450;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 452;BA.debugLine="Panel3.Color=Colors.RGB(152,159,254)";
mostCurrent._panel3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 453;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"permintaanBarang.png").getObject()));
 //BA.debugLineNum = 454;BA.debugLine="Label3.TextColor=Colors.black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 456;BA.debugLine="Panel4.Color=Colors.RGB(152,159,254)";
mostCurrent._panel4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 457;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets,\"pe";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pengadaanbarang.png").getObject()));
 //BA.debugLineNum = 458;BA.debugLine="Label4.TextColor=Colors.black";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 460;BA.debugLine="Panel5.Color=Colors.RGB(152,159,254)";
mostCurrent._panel5.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 461;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets,\"tr";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"trackingstatus.png").getObject()));
 //BA.debugLineNum = 462;BA.debugLine="Label5.TextColor=Colors.Black";
mostCurrent._label5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 464;BA.debugLine="Panel6.Color=Colors.RGB(152,159,254)";
mostCurrent._panel6.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 465;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets,\"ko";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"kodefikasi.png").getObject()));
 //BA.debugLineNum = 466;BA.debugLine="Label6.TextColor=Colors.black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 468;BA.debugLine="Panel7.Color=Colors.RGB(152,159,254)";
mostCurrent._panel7.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (152),(int) (159),(int) (254)));
 //BA.debugLineNum = 469;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets,\"pr";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"profileuser.png").getObject()));
 //BA.debugLineNum = 470;BA.debugLine="Label7.TextColor=Colors.Black";
mostCurrent._label7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 472;BA.debugLine="Panel8.Color=Colors.RGB(88,99,255)";
mostCurrent._panel8.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (88),(int) (99),(int) (255)));
 //BA.debugLineNum = 473;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets,\"in";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"infografiswhite.png").getObject()));
 //BA.debugLineNum = 474;BA.debugLine="Label8.TextColor=Colors.white";
mostCurrent._label8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 478;BA.debugLine="ImageView10.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 479;BA.debugLine="Label12.TextColor=Colors.black";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 481;BA.debugLine="ImageView11.Bitmap = LoadBitmap(File.DirAssets,\"i";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"inventaris.png").getObject()));
 //BA.debugLineNum = 482;BA.debugLine="Label13.TextColor=Colors.black";
mostCurrent._label13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 487;BA.debugLine="Drawer.LeftOpen = False";
mostCurrent._drawer._setleftopen /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
