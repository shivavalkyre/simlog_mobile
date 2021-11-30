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

public class newbarangexisting extends Activity implements B4AActivity{
	public static newbarangexisting mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.simlog", "com.simlog.newbarangexisting");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (newbarangexisting).");
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
		activityBA = new BA(this, layout, processBA, "com.simlog", "com.simlog.newbarangexisting");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.simlog.newbarangexisting", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (newbarangexisting) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (newbarangexisting) Resume **");
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
		return newbarangexisting.class;
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
            BA.LogInfo("** Activity (newbarangexisting) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (newbarangexisting) Pause event (activity is not paused). **");
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
            newbarangexisting mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (newbarangexisting) Resume **");
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext12 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellist1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public static int _labelliststate = 0;
public static int _inventarisstate = 0;
public anywheresoftware.b4a.objects.LabelWrapper _labellist3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellist4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public flm.b4a.scrollview2d.ScrollView2DWrapper _scrollview2d1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel14 = null;
public de.donmanfred.SweetAlertDialogWrapper _sweet = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmessageclose = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellock = null;
public com.simlog.main _main = null;
public com.simlog.starter _starter = null;
public com.simlog.general _general = null;
public com.simlog.register _register = null;
public com.simlog.login _login = null;
public com.simlog.forgotpasswoord _forgotpasswoord = null;
public com.simlog.home _home = null;
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
 //BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 50;BA.debugLine="Activity.LoadLayout(\"LayoutScvNewBarang\")";
mostCurrent._activity.LoadLayout("LayoutScvNewBarang",mostCurrent.activityBA);
 //BA.debugLineNum = 51;BA.debugLine="ScrollView1.Panel.LoadLayout(\"LayoutNewBarang\")";
mostCurrent._scrollview1.getPanel().LoadLayout("LayoutNewBarang",mostCurrent.activityBA);
 //BA.debugLineNum = 52;BA.debugLine="ScrollView1.Panel.Height= Button1.Top+Button1.Hei";
mostCurrent._scrollview1.getPanel().setHeight((int) (mostCurrent._button1.getTop()+mostCurrent._button1.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))));
 //BA.debugLineNum = 57;BA.debugLine="general.SetBackgroundTintList(EditText1,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext1.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 58;BA.debugLine="general.SetBackgroundTintList(EditText2,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext2.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 59;BA.debugLine="general.SetBackgroundTintList(EditText3,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext3.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 60;BA.debugLine="general.SetBackgroundTintList(EditText4,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext4.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 61;BA.debugLine="general.SetBackgroundTintList(EditText5,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext5.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 62;BA.debugLine="general.SetBackgroundTintList(EditText6,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext6.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 63;BA.debugLine="general.SetBackgroundTintList(EditText7,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext7.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 64;BA.debugLine="general.SetBackgroundTintList(EditText8,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext8.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 65;BA.debugLine="general.SetBackgroundTintList(EditText9,Colors.Wh";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext9.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 66;BA.debugLine="general.SetBackgroundTintList(EditText10,Colors.W";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext10.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 67;BA.debugLine="general.SetBackgroundTintList(EditText11,Colors.W";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext11.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 68;BA.debugLine="general.SetBackgroundTintList(EditText12,Colors.W";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._edittext12.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 244;BA.debugLine="Panel14.Top=50%y-Panel14.Height/2";
mostCurrent._panel14.setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-mostCurrent._panel14.getHeight()/(double)2));
 //BA.debugLineNum = 245;BA.debugLine="Panel14.SetVisibleAnimated(300,True)";
mostCurrent._panel14.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 246;BA.debugLine="PanelLock.Visible=True";
mostCurrent._panellock.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 247;BA.debugLine="ScrollView1.Enabled=False";
mostCurrent._scrollview1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 248;BA.debugLine="ScrollView1.Panel.Enabled=False";
mostCurrent._scrollview1.getPanel().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 249;BA.debugLine="ScrollView1.Panel.RemoveAllViews";
mostCurrent._scrollview1.getPanel().RemoveAllViews();
 //BA.debugLineNum = 250;BA.debugLine="ScrollView1.ScrollPosition=0";
mostCurrent._scrollview1.setScrollPosition((int) (0));
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Private Sub Button3_Click";
 //BA.debugLineNum = 275;BA.debugLine="PanelLock.Visible=False";
mostCurrent._panellock.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 276;BA.debugLine="Panel14.SetVisibleAnimated(200,False)";
mostCurrent._panel14.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 277;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private EditText1 As EditText";
mostCurrent._edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private EditText2 As EditText";
mostCurrent._edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private EditText3 As EditText";
mostCurrent._edittext3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private EditText4 As EditText";
mostCurrent._edittext4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private EditText5 As EditText";
mostCurrent._edittext5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private EditText6 As EditText";
mostCurrent._edittext6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private EditText7 As EditText";
mostCurrent._edittext7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private EditText8 As EditText";
mostCurrent._edittext8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private EditText9 As EditText";
mostCurrent._edittext9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private EditText10 As EditText";
mostCurrent._edittext10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private EditText11 As EditText";
mostCurrent._edittext11 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private EditText12 As EditText";
mostCurrent._edittext12 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Button2 As Button";
mostCurrent._button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Button1 As Button";
mostCurrent._button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private ListView1 As ListView";
mostCurrent._listview1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private LabelList1 As Label";
mostCurrent._labellist1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private LabelListState As Int";
_labelliststate = 0;
 //BA.debugLineNum = 35;BA.debugLine="Private InventarisState As Int";
_inventarisstate = 0;
 //BA.debugLineNum = 36;BA.debugLine="Private LabelList3 As Label";
mostCurrent._labellist3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Panel8 As Panel";
mostCurrent._panel8 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private LabelList4 As Label";
mostCurrent._labellist4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Panel2 As Panel";
mostCurrent._panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private ScrollView2D1 As ScrollView2D";
mostCurrent._scrollview2d1 = new flm.b4a.scrollview2d.ScrollView2DWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Panel14 As Panel";
mostCurrent._panel14 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private sweet As SweetAlertDialog";
mostCurrent._sweet = new de.donmanfred.SweetAlertDialogWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Button3 As Button";
mostCurrent._button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private LabelMessageClose As Label";
mostCurrent._labelmessageclose = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private PanelLock As Panel";
mostCurrent._panellock = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _labellist1_click() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
 //BA.debugLineNum = 80;BA.debugLine="Private Sub LabelList1_Click";
 //BA.debugLineNum = 82;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 83;BA.debugLine="r.Target = ScrollView1";
_r.Target = (Object)(mostCurrent._scrollview1.getObject());
 //BA.debugLineNum = 84;BA.debugLine="r.RunMethod2(\"setVerticalScrollBarEnabled\", False";
_r.RunMethod2("setVerticalScrollBarEnabled",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False),"java.lang.boolean");
 //BA.debugLineNum = 85;BA.debugLine="r.RunMethod2(\"setOverScrollMode\", 2, \"java.lang.i";
_r.RunMethod2("setOverScrollMode",BA.NumberToString(2),"java.lang.int");
 //BA.debugLineNum = 88;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 89;BA.debugLine="gd.Initialize(\"BOTTOM_TOP\", Array As Int (Colors.";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"BOTTOM_TOP"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White});
 //BA.debugLineNum = 90;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
 //BA.debugLineNum = 91;BA.debugLine="ListView1.AddSingleLine(\"Inventaris\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Inventaris"));
 //BA.debugLineNum = 92;BA.debugLine="ListView1.AddSingleLine(\"Persediaan\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Persediaan"));
 //BA.debugLineNum = 93;BA.debugLine="ListView1.Height=100dip";
mostCurrent._listview1.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
 //BA.debugLineNum = 94;BA.debugLine="ListView1.Top=Panel1.Top+Panel1.Height";
mostCurrent._listview1.setTop((int) (mostCurrent._panel1.getTop()+mostCurrent._panel1.getHeight()));
 //BA.debugLineNum = 95;BA.debugLine="ListView1.BringToFront";
mostCurrent._listview1.BringToFront();
 //BA.debugLineNum = 96;BA.debugLine="ListView1.SingleLineLayout.Background = gd";
mostCurrent._listview1.getSingleLineLayout().Background = (android.graphics.drawable.Drawable)(_gd.getObject());
 //BA.debugLineNum = 97;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor= Color";
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 98;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=12";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (12));
 //BA.debugLineNum = 99;BA.debugLine="ListView1.SingleLineLayout.Label.Typeface=Typefac";
mostCurrent._listview1.getSingleLineLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("poppins-regular.ttf"));
 //BA.debugLineNum = 100;BA.debugLine="InventarisState=0";
_inventarisstate = (int) (0);
 //BA.debugLineNum = 102;BA.debugLine="If LabelListState =0 Then";
if (_labelliststate==0) { 
 //BA.debugLineNum = 103;BA.debugLine="ListView1.SetVisibleAnimated(200,True)";
mostCurrent._listview1.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 104;BA.debugLine="LabelListState=1";
_labelliststate = (int) (1);
 }else {
 //BA.debugLineNum = 106;BA.debugLine="ListView1.SetVisibleAnimated(200,False)";
mostCurrent._listview1.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 107;BA.debugLine="LabelListState=0";
_labelliststate = (int) (0);
 };
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public static String  _labellist3_click() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
 //BA.debugLineNum = 156;BA.debugLine="Private Sub LabelList3_Click";
 //BA.debugLineNum = 158;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 159;BA.debugLine="r.Target = ScrollView1";
_r.Target = (Object)(mostCurrent._scrollview1.getObject());
 //BA.debugLineNum = 160;BA.debugLine="r.RunMethod2(\"setVerticalScrollBarEnabled\", False";
_r.RunMethod2("setVerticalScrollBarEnabled",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False),"java.lang.boolean");
 //BA.debugLineNum = 162;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 163;BA.debugLine="gd.Initialize(\"BOTTOM_TOP\", Array As Int (Colors.";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"BOTTOM_TOP"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White});
 //BA.debugLineNum = 164;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
 //BA.debugLineNum = 165;BA.debugLine="ListView1.AddSingleLine(\"Baik\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Baik"));
 //BA.debugLineNum = 166;BA.debugLine="ListView1.AddSingleLine(\"Rusak Ringan\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Rusak Ringan"));
 //BA.debugLineNum = 167;BA.debugLine="ListView1.AddSingleLine(\"Rusak Berat\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Rusak Berat"));
 //BA.debugLineNum = 168;BA.debugLine="ListView1.Height=150dip";
mostCurrent._listview1.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
 //BA.debugLineNum = 169;BA.debugLine="ListView1.Top=Panel8.Top+Panel8.Height";
mostCurrent._listview1.setTop((int) (mostCurrent._panel8.getTop()+mostCurrent._panel8.getHeight()));
 //BA.debugLineNum = 170;BA.debugLine="ListView1.BringToFront";
mostCurrent._listview1.BringToFront();
 //BA.debugLineNum = 171;BA.debugLine="ListView1.SingleLineLayout.Background = gd";
mostCurrent._listview1.getSingleLineLayout().Background = (android.graphics.drawable.Drawable)(_gd.getObject());
 //BA.debugLineNum = 172;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor= Color";
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 173;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=12";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (12));
 //BA.debugLineNum = 174;BA.debugLine="ListView1.SingleLineLayout.Label.Typeface=Typefac";
mostCurrent._listview1.getSingleLineLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("poppins-regular.ttf"));
 //BA.debugLineNum = 176;BA.debugLine="If LabelListState =0 Then";
if (_labelliststate==0) { 
 //BA.debugLineNum = 177;BA.debugLine="ListView1.SetVisibleAnimated(200,True)";
mostCurrent._listview1.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 178;BA.debugLine="LabelListState=1";
_labelliststate = (int) (1);
 }else {
 //BA.debugLineNum = 180;BA.debugLine="ListView1.SetVisibleAnimated(200,False)";
mostCurrent._listview1.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 181;BA.debugLine="LabelListState=0";
_labelliststate = (int) (0);
 };
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _labellist4_click() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
 //BA.debugLineNum = 186;BA.debugLine="Private Sub LabelList4_Click";
 //BA.debugLineNum = 188;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 189;BA.debugLine="r.Target = ScrollView1";
_r.Target = (Object)(mostCurrent._scrollview1.getObject());
 //BA.debugLineNum = 190;BA.debugLine="r.RunMethod2(\"setVerticalScrollBarEnabled\", False";
_r.RunMethod2("setVerticalScrollBarEnabled",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False),"java.lang.boolean");
 //BA.debugLineNum = 191;BA.debugLine="r.RunMethod2(\"setOverScrollMode\", 2, \"java.lang.i";
_r.RunMethod2("setOverScrollMode",BA.NumberToString(2),"java.lang.int");
 //BA.debugLineNum = 192;BA.debugLine="ScrollView1.Enabled =False";
mostCurrent._scrollview1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 194;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 195;BA.debugLine="gd.Initialize(\"BOTTOM_TOP\", Array As Int (Colors.";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"BOTTOM_TOP"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White});
 //BA.debugLineNum = 196;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
 //BA.debugLineNum = 197;BA.debugLine="If EditText1.Text=\"Persediaan\" Then";
if ((mostCurrent._edittext1.getText()).equals("Persediaan")) { 
 //BA.debugLineNum = 198;BA.debugLine="ListView1.AddSingleLine(\"Suku Cadang\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Suku Cadang"));
 //BA.debugLineNum = 199;BA.debugLine="ListView1.AddSingleLine(\"Bahan Baku\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Bahan Baku"));
 //BA.debugLineNum = 200;BA.debugLine="ListView1.AddSingleLine(\"Konsumsi\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Konsumsi"));
 //BA.debugLineNum = 201;BA.debugLine="ListView1.AddSingleLine(\"Pemeliharaan\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Pemeliharaan"));
 //BA.debugLineNum = 202;BA.debugLine="ListView1.AddSingleLine(\"Barang Lainnya\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Barang Lainnya"));
 //BA.debugLineNum = 203;BA.debugLine="ListView1.AddSingleLine(\"Bahan Berjaga-Jaga\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Bahan Berjaga-Jaga"));
 //BA.debugLineNum = 204;BA.debugLine="ListView1.RequestFocus";
mostCurrent._listview1.RequestFocus();
 //BA.debugLineNum = 205;BA.debugLine="ListView1.Height=250dip";
mostCurrent._listview1.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
 //BA.debugLineNum = 206;BA.debugLine="ListView1.Top=Panel2.Top+Panel2.Height";
mostCurrent._listview1.setTop((int) (mostCurrent._panel2.getTop()+mostCurrent._panel2.getHeight()));
 //BA.debugLineNum = 207;BA.debugLine="ListView1.BringToFront";
mostCurrent._listview1.BringToFront();
 //BA.debugLineNum = 208;BA.debugLine="ListView1.SingleLineLayout.Background = gd";
mostCurrent._listview1.getSingleLineLayout().Background = (android.graphics.drawable.Drawable)(_gd.getObject());
 //BA.debugLineNum = 209;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor= Colo";
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 210;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=12";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (12));
 //BA.debugLineNum = 211;BA.debugLine="ListView1.SingleLineLayout.Label.Typeface=Typefa";
mostCurrent._listview1.getSingleLineLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("poppins-regular.ttf"));
 }else if((mostCurrent._edittext1.getText()).equals("Inventaris")) { 
 //BA.debugLineNum = 214;BA.debugLine="ListView1.AddSingleLine(\"Inventaris\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence("Inventaris"));
 //BA.debugLineNum = 215;BA.debugLine="ListView1.RequestFocus";
mostCurrent._listview1.RequestFocus();
 //BA.debugLineNum = 216;BA.debugLine="ListView1.Height=40dip";
mostCurrent._listview1.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
 //BA.debugLineNum = 217;BA.debugLine="ListView1.Top=Panel2.Top+Panel2.Height";
mostCurrent._listview1.setTop((int) (mostCurrent._panel2.getTop()+mostCurrent._panel2.getHeight()));
 //BA.debugLineNum = 218;BA.debugLine="ListView1.BringToFront";
mostCurrent._listview1.BringToFront();
 //BA.debugLineNum = 219;BA.debugLine="ListView1.SingleLineLayout.Background = gd";
mostCurrent._listview1.getSingleLineLayout().Background = (android.graphics.drawable.Drawable)(_gd.getObject());
 //BA.debugLineNum = 220;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor= Colo";
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 221;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=12";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (12));
 //BA.debugLineNum = 222;BA.debugLine="ListView1.SingleLineLayout.Label.Typeface=Typefa";
mostCurrent._listview1.getSingleLineLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("poppins-regular.ttf"));
 //BA.debugLineNum = 223;BA.debugLine="InventarisState=1";
_inventarisstate = (int) (1);
 }else {
 //BA.debugLineNum = 226;BA.debugLine="LabelListState=1";
_labelliststate = (int) (1);
 //BA.debugLineNum = 227;BA.debugLine="MsgboxAsync(\"Pilih Kode Parent\", \"Simlog\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Pilih Kode Parent"),BA.ObjectToCharSequence("Simlog"),processBA);
 };
 //BA.debugLineNum = 231;BA.debugLine="If LabelListState =0 Then";
if (_labelliststate==0) { 
 //BA.debugLineNum = 232;BA.debugLine="ListView1.SetVisibleAnimated(200,True)";
mostCurrent._listview1.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 233;BA.debugLine="LabelListState=1";
_labelliststate = (int) (1);
 }else {
 //BA.debugLineNum = 235;BA.debugLine="ListView1.SetVisibleAnimated(200,False)";
mostCurrent._listview1.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 236;BA.debugLine="LabelListState=0";
_labelliststate = (int) (0);
 };
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public static String  _labelmessageclose_click() throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Private Sub LabelMessageClose_Click";
 //BA.debugLineNum = 281;BA.debugLine="PanelLock.Visible=False";
mostCurrent._panellock.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 282;BA.debugLine="Panel14.SetVisibleAnimated(200,False)";
mostCurrent._panel14.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 283;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Private Sub ListView1_ItemClick (Position As Int,";
 //BA.debugLineNum = 112;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)("Inventaris"),(Object)("Persediaan"),(Object)("Baik"),(Object)("Rusak Ringan"),(Object)("Rusak Berat"),(Object)("Suku Cadang"),(Object)("Bahan Baku"),(Object)("Konsumsi"),(Object)("Pemeliharaan"),(Object)("Barang Lainnya"),(Object)("Bahan Berjaga-Jaga"))) {
case 0: {
 //BA.debugLineNum = 114;BA.debugLine="If InventarisState=0 Then";
if (_inventarisstate==0) { 
 //BA.debugLineNum = 115;BA.debugLine="EditText1.Text=Value";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 116;BA.debugLine="EditText2.Text=\"\"";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 117;BA.debugLine="EditText2.RequestFocus";
mostCurrent._edittext2.RequestFocus();
 }else if(_inventarisstate==1) { 
 //BA.debugLineNum = 119;BA.debugLine="EditText2.Text=Value";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 120;BA.debugLine="EditText3.RequestFocus";
mostCurrent._edittext3.RequestFocus();
 };
 break; }
case 1: {
 //BA.debugLineNum = 124;BA.debugLine="EditText1.Text=Value";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 125;BA.debugLine="EditText2.Text=\"\"";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 126;BA.debugLine="EditText2.RequestFocus";
mostCurrent._edittext2.RequestFocus();
 break; }
case 2: {
 //BA.debugLineNum = 129;BA.debugLine="EditText8.Text=Value";
mostCurrent._edittext8.setText(BA.ObjectToCharSequence(_value));
 break; }
case 3: {
 //BA.debugLineNum = 132;BA.debugLine="EditText8.Text=Value";
mostCurrent._edittext8.setText(BA.ObjectToCharSequence(_value));
 break; }
case 4: {
 //BA.debugLineNum = 135;BA.debugLine="EditText8.Text=Value";
mostCurrent._edittext8.setText(BA.ObjectToCharSequence(_value));
 break; }
case 5: {
 //BA.debugLineNum = 137;BA.debugLine="EditText2.Text =Value";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_value));
 break; }
case 6: {
 //BA.debugLineNum = 139;BA.debugLine="EditText2.Text =Value";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_value));
 break; }
case 7: {
 //BA.debugLineNum = 141;BA.debugLine="EditText2.Text =Value";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_value));
 break; }
case 8: {
 //BA.debugLineNum = 143;BA.debugLine="EditText2.Text =Value";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_value));
 break; }
case 9: {
 //BA.debugLineNum = 145;BA.debugLine="EditText2.Text =Value";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_value));
 break; }
case 10: {
 //BA.debugLineNum = 147;BA.debugLine="EditText2.Text =Value";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_value));
 break; }
}
;
 //BA.debugLineNum = 150;BA.debugLine="MsgboxAsync(Value,\"Simlog\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_value),BA.ObjectToCharSequence("Simlog"),processBA);
 //BA.debugLineNum = 151;BA.debugLine="LabelListState=0";
_labelliststate = (int) (0);
 //BA.debugLineNum = 153;BA.debugLine="ListView1.SetVisibleAnimated(200,False)";
mostCurrent._listview1.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
