package com.simlog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_register{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setLeft((int)((50d / 100 * width)-(views.get("imageview1").vw.getWidth())/2d));
views.get("label1").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())));
views.get("panel1").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(10d * scale)));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())+(10d * scale)));
views.get("panel3").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(10d * scale)));
views.get("panel4").vw.setTop((int)((views.get("panel3").vw.getTop())+(views.get("panel3").vw.getHeight())+(10d * scale)));
views.get("panel5").vw.setTop((int)((views.get("panel4").vw.getTop())+(views.get("panel4").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 10;BA.debugLine="Button1.Top=Panel5.Top+Panel5.Height+10dip"[Register/General script]
views.get("button1").vw.setTop((int)((views.get("panel5").vw.getTop())+(views.get("panel5").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 12;BA.debugLine="Label7.Top= Button1.Top+Button1.Height+5dip"[Register/General script]
views.get("label7").vw.setTop((int)((views.get("button1").vw.getTop())+(views.get("button1").vw.getHeight())+(5d * scale)));

}
}