package com.simlog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutmenu{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageviewbottommenu1").vw.setLeft((int)(0d));
views.get("imageviewbottommenu5").vw.setLeft((int)((100d / 100 * width)-(views.get("imageviewbottommenu5").vw.getWidth())));
views.get("imageviewbottommenu3").vw.setLeft((int)((50d / 100 * width)-(views.get("imageviewbottommenu3").vw.getWidth())/2d));
views.get("imageviewbottommenu2").vw.setLeft((int)(((views.get("imageviewbottommenu3").vw.getLeft())-((views.get("imageviewbottommenu1").vw.getLeft())+(views.get("imageviewbottommenu1").vw.getWidth())))/2d+(views.get("imageviewbottommenu2").vw.getWidth())/2d));
views.get("imageviewbottommenu4").vw.setLeft((int)((75d / 100 * width)-(views.get("imageviewbottommenu4").vw.getWidth())/2d));

}
}