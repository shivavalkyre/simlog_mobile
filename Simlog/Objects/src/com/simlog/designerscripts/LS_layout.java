package com.simlog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layout{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setLeft((int)((50d / 100 * width)-(views.get("imageview1").vw.getWidth())/2d));
views.get("panel1").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(10d * scale)));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())+(10d * scale)));
views.get("checkbox1").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(5d * scale)));
views.get("label4").vw.setTop((int)((views.get("checkbox1").vw.getTop())));
//BA.debugLineNum = 9;BA.debugLine="Button1.Top=CheckBox1.Top+CheckBox1.Height+10dip"[Layout/General script]
views.get("button1").vw.setTop((int)((views.get("checkbox1").vw.getTop())+(views.get("checkbox1").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 11;BA.debugLine="Label5.Top= Button1.Top+Button1.Height+5dip"[Layout/General script]
views.get("label5").vw.setTop((int)((views.get("button1").vw.getTop())+(views.get("button1").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 12;BA.debugLine="PanelErrorPopup.Top= Label5.Top+Label5.Height+10dip"[Layout/General script]
views.get("panelerrorpopup").vw.setTop((int)((views.get("label5").vw.getTop())+(views.get("label5").vw.getHeight())+(10d * scale)));

}
}