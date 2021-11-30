package com.simlog;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clspb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.simlog.clspb");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.simlog.clspb.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _m = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
public com.simlog.main _main = null;
public com.simlog.starter _starter = null;
public com.simlog.general _general = null;
public com.simlog.register _register = null;
public com.simlog.login _login = null;
public com.simlog.forgotpasswoord _forgotpasswoord = null;
public com.simlog.home _home = null;
public com.simlog.newbarangexisting _newbarangexisting = null;
public com.simlog.permintaanbarang _permintaanbarang = null;
public com.simlog.listpermintaanbarang _listpermintaanbarang = null;
public com.simlog.pengadaanbarang _pengadaanbarang = null;
public com.simlog.trackingstatus _trackingstatus = null;
public com.simlog.httputils2service _httputils2service = null;
public String  _addproperty(String _skey,String _svalue) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub AddProperty(sKey As String, sValue As S";
 //BA.debugLineNum = 14;BA.debugLine="m.Put(sKey, sValue)";
_m.Put((Object)(_skey),(Object)(_svalue));
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _append(String _sline) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Append(sLine As String)";
 //BA.debugLineNum = 33;BA.debugLine="sb.Append(sLine)";
_sb.Append(_sline);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _appendline(String _sline) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub AppendLine(sLine As String)";
 //BA.debugLineNum = 29;BA.debugLine="sb.Append(sLine).Append(CRLF)";
_sb.Append(_sline).Append(__c.CRLF);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 10;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
int _i = 0;
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Render() As String";
 //BA.debugLineNum = 18;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 19;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="For i = 0 To m.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_m.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 21;BA.debugLine="If i > 0 Then sb.Append(\" \")";
if (_i>0) { 
_sb.Append(" ");};
 //BA.debugLineNum = 22;BA.debugLine="sb.Append(m.GetKeyAt(i)).Append(\"=\").Append(QUOT";
_sb.Append(BA.ObjectToString(_m.GetKeyAt(_i))).Append("=").Append(__c.QUOTE).Append(BA.ObjectToString(_m.GetValueAt(_i))).Append(__c.QUOTE);
 }
};
 //BA.debugLineNum = 24;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _renderlines() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub RenderLines() As String";
 //BA.debugLineNum = 41;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub ToString() As String";
 //BA.debugLineNum = 37;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
