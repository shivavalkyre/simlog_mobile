package com.simlog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutscvnewbarang{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel14").vw.setTop((int)((50d / 100 * height)-(views.get("imageview2").vw.getHeight())/2d));
views.get("imageview2").vw.setLeft((int)((views.get("panel14").vw.getWidth())/2d-(views.get("imageview2").vw.getWidth())/2d));

}
}