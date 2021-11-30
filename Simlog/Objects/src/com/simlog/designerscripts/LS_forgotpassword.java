package com.simlog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_forgotpassword{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[ForgotPassword/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="ImageView1.Top= 10%y"[ForgotPassword/General script]
views.get("imageview1").vw.setTop((int)((10d / 100 * height)));
//BA.debugLineNum = 4;BA.debugLine="ImageView1.Left=50%x-ImageView1.Width/2"[ForgotPassword/General script]
views.get("imageview1").vw.setLeft((int)((50d / 100 * width)-(views.get("imageview1").vw.getWidth())/2d));
//BA.debugLineNum = 5;BA.debugLine="Label2.Top = ImageView1.Top+ImageView1.Height+10dip"[ForgotPassword/General script]
views.get("label2").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 6;BA.debugLine="Panel2.Top=Label2.Top+Label2.Height+10dip"[ForgotPassword/General script]
views.get("panel2").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 7;BA.debugLine="Button1.Top=Panel2.Top+Panel2.Height+10dip"[ForgotPassword/General script]
views.get("button1").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 9;BA.debugLine="Label1.Top= Button1.Top+Button1.Height+10dip"[ForgotPassword/General script]
views.get("label1").vw.setTop((int)((views.get("button1").vw.getTop())+(views.get("button1").vw.getHeight())+(10d * scale)));

}
}