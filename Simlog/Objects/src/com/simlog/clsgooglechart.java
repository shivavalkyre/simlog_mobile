package com.simlog;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clsgooglechart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.simlog.clsgooglechart");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.simlog.clsgooglechart.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.simlog.clsgooglechart._focustargettype _focustargetenum = null;
public String _focustarget = "";
public com.simlog.clsgooglechart._curvetypetype _curvetypeenum = null;
public String _curvetype = "";
public com.simlog.clsgooglechart._axistitlespositiontype _axistitlespositionenum = null;
public String _axistitlesposition = "";
public int _haxisslantedtextangle = 0;
public boolean _haxisslantedtext = false;
public int _zoomlevel = 0;
public boolean _usemaptypecontrol = false;
public String _linecolor = "";
public int _linewidth = 0;
public String _dt_string = "";
public String _dt_number = "";
public String _dt_date = "";
public String _dt_datetime = "";
public String _dt_timeofday = "";
public String _dt_boolean = "";
public String _dt_time = "";
public boolean _rtltable = false;
public boolean _showline = false;
public int _animationduration = 0;
public boolean _enablescrollwheel = false;
public boolean _showtip = false;
public boolean _avoidoverlappinggridlines = false;
public String _xaxis = "";
public String _yaxis = "";
public anywheresoftware.b4a.objects.collections.List _x = null;
public anywheresoftware.b4a.objects.collections.List _y = null;
public String _title = "";
public String _width = "";
public String _height = "";
public int _pagesize = 0;
public String _backgroundcolorinhex = "";
public int _sortcolumn = 0;
public boolean _showrowlabels = false;
public String _singlecolorinhex = "";
public boolean _groupbyrowlabel = false;
public boolean _colorbyrowlabel = false;
public String _region = "";
public boolean _allowcollapse = false;
public boolean _sortascending = false;
public String _top = "";
public String _left = "";
public int _firstrownumber = 0;
public boolean _isstacked = false;
public boolean _allowhtml = false;
public int _startpage = 0;
public String _html = "";
public boolean _savetoo = false;
public boolean _detectclick = false;
public int _bubblefontsize = 0;
public anywheresoftware.b4a.objects.collections.List _masterseries = null;
public boolean _showrownumber = false;
public String _haxistitle = "";
public String _vaxistitle = "";
public boolean _alternatingrowstyle = false;
public boolean _keepaspectratio = false;
public String _nodeclass = "";
public String _selectednodeclass = "";
public boolean _enableregioninteractivity = false;
public boolean _magnifyingglassenable = false;
public double _haxismaxvalue = 0;
public double _haxisminvalue = 0;
public double _vaxismaxvalue = 0;
public double _vaxisminvalue = 0;
public double _magnifyingglasszoomfactor = 0;
public com.simlog.clsgooglechart._datatypetype _datatypeenum = null;
public com.simlog.clsgooglechart._animationeasingtype _animationeasingenum = null;
public String _animationeasing = "";
public com.simlog.clsgooglechart._seriestype1 _seriestypeenum = null;
public String _seriestype = "";
public com.simlog.clsgooglechart._pieslicetexttype _pieslicetextenum = null;
public String _pieslicetext = "";
public com.simlog.clsgooglechart._legendalignmenttype _legendalignmentenum = null;
public String _legendalignment = "";
public com.simlog.clsgooglechart._legendpositiontype _legendpositionenum = null;
public String _legendposition = "";
public com.simlog.clsgooglechart._chartstype _charttypeenum = null;
public String _charttype = "";
public com.simlog.clsgooglechart._displaymodetype _displaymodetypeenum = null;
public String _displaymode = "";
public com.simlog.clsgooglechart._resolutiontype _resolutiontypeenum = null;
public String _resolution = "";
public com.simlog.clsgooglechart._maptypetype _maptypeenum = null;
public String _maptype = "";
public com.simlog.clsgooglechart._zoomleveltype _zoomlevelenum = null;
public String _zoomlevelof = "";
public com.simlog.clsgooglechart._nodesizetype _nodesizeenum = null;
public String _nodesize = "";
public com.simlog.clsgooglechart._columnformattype _columnformatenum = null;
public String _columnformat = "";
public com.simlog.clsgooglechart._pagetype _pageenum = null;
public String _page = "";
public com.simlog.clsgooglechart._sorttype _sortenum = null;
public com.simlog.clsgooglechart._barformattype _barformatoption = null;
public com.simlog.clsgooglechart._numberformattype _numberformatoption = null;
public String _sort = "";
public String _version = "";
public int _redfrom = 0;
public int _redto = 0;
public int _yellowfrom = 0;
public int _yellowto = 0;
public int _minorticks = 0;
public int _majorticks = 0;
public int _greenfrom = 0;
public int _greento = 0;
public int _maxgauge = 0;
public int _mingauge = 0;
public String _backgroundcolor = "";
public int _fontsize = 0;
public String _fontname = "";
public boolean _isdataview = false;
public boolean _is3d = false;
public boolean _reversecategories = false;
public anywheresoftware.b4a.objects.collections.Map _mseries = null;
public boolean _enableinteractivity = false;
public boolean _animate = false;
public anywheresoftware.b4a.objects.collections.Map _coloraxiscolors = null;
public anywheresoftware.b4a.objects.collections.Map _seriestypes = null;
public String _defaultseriestype = "";
public anywheresoftware.b4a.objects.collections.Map _fieldsandtypes = null;
public anywheresoftware.b4a.objects.collections.Map _columnformats = null;
public anywheresoftware.b4a.objects.collections.Map _columnbarformats = null;
public anywheresoftware.b4a.objects.collections.Map _ownpatterns = null;
public anywheresoftware.b4a.objects.collections.Map _columnnumberformats = null;
public anywheresoftware.b4a.objects.collections.List _mseriesl = null;
public anywheresoftware.b4a.objects.collections.Map _seriescolors = null;
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
public static class _focustargettype{
public boolean IsInitialized;
public String datum;
public String category;
public void Initialize() {
IsInitialized = true;
datum = "";
category = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _curvetypetype{
public boolean IsInitialized;
public String None;
public String Function;
public void Initialize() {
IsInitialized = true;
None = "";
Function = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _axistitlespositiontype{
public boolean IsInitialized;
public String AxisIn;
public String AxisOut;
public String AxisNone;
public void Initialize() {
IsInitialized = true;
AxisIn = "";
AxisOut = "";
AxisNone = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _datatypetype{
public boolean IsInitialized;
public String DT_String;
public String DT_Number;
public String DT_Date;
public String DT_DateTime;
public String DT_TimeOfDay;
public String DT_Boolean;
public String DT_Time;
public void Initialize() {
IsInitialized = true;
DT_String = "";
DT_Number = "";
DT_Date = "";
DT_DateTime = "";
DT_TimeOfDay = "";
DT_Boolean = "";
DT_Time = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _animationeasingtype{
public boolean IsInitialized;
public String AELinear;
public String AEIn;
public String AEOut;
public String AEinAndOut;
public void Initialize() {
IsInitialized = true;
AELinear = "";
AEIn = "";
AEOut = "";
AEinAndOut = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _seriestype1{
public boolean IsInitialized;
public String Line;
public String Area;
public String Bars;
public String CandleSticks;
public String SteppedArea;
public void Initialize() {
IsInitialized = true;
Line = "";
Area = "";
Bars = "";
CandleSticks = "";
SteppedArea = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pieslicetexttype{
public boolean IsInitialized;
public String IsPercentage;
public String IsValue;
public String IsLabel;
public String IsNone;
public void Initialize() {
IsInitialized = true;
IsPercentage = "";
IsValue = "";
IsLabel = "";
IsNone = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _legendalignmenttype{
public boolean IsInitialized;
public String AtStart;
public String AtCenter;
public String AtEnd;
public void Initialize() {
IsInitialized = true;
AtStart = "";
AtCenter = "";
AtEnd = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _legendpositiontype{
public boolean IsInitialized;
public String Top;
public String Left;
public String Right;
public String Bottom;
public String None;
public void Initialize() {
IsInitialized = true;
Top = "";
Left = "";
Right = "";
Bottom = "";
None = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _chartstype{
public boolean IsInitialized;
public String PieChart;
public String LineChart;
public String StackedBarChart;
public String StackedColumnChart;
public String AreaChart;
public String ColumnChart;
public String GeoChart;
public String ComboChart;
public String Gauge;
public String OrgChart;
public String BubbleChart;
public String Timeline;
public String Donut;
public String MapChart;
public String ScatterChart;
public String Table;
public String BarChart;
public String Motionchart;
public String SteppedAreaChart;
public void Initialize() {
IsInitialized = true;
PieChart = "";
LineChart = "";
StackedBarChart = "";
StackedColumnChart = "";
AreaChart = "";
ColumnChart = "";
GeoChart = "";
ComboChart = "";
Gauge = "";
OrgChart = "";
BubbleChart = "";
Timeline = "";
Donut = "";
MapChart = "";
ScatterChart = "";
Table = "";
BarChart = "";
Motionchart = "";
SteppedAreaChart = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _displaymodetype{
public boolean IsInitialized;
public String Auto;
public String Regions;
public String Markers;
public void Initialize() {
IsInitialized = true;
Auto = "";
Regions = "";
Markers = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _resolutiontype{
public boolean IsInitialized;
public String Countries;
public String Provinces;
public String Metros;
public void Initialize() {
IsInitialized = true;
Countries = "";
Provinces = "";
Metros = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _maptypetype{
public boolean IsInitialized;
public String Normal;
public String Terrain;
public String Satellite;
public String Hybrid;
public void Initialize() {
IsInitialized = true;
Normal = "";
Terrain = "";
Satellite = "";
Hybrid = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _nodesizetype{
public boolean IsInitialized;
public String NodeSmall;
public String NodeMedium;
public String NodeLarge;
public void Initialize() {
IsInitialized = true;
NodeSmall = "";
NodeMedium = "";
NodeLarge = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _zoomleveltype{
public boolean IsInitialized;
public String Automatic;
public String Number;
public void Initialize() {
IsInitialized = true;
Automatic = "";
Number = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _columnformattype{
public boolean IsInitialized;
public String MediumDate;
public String ShortDate;
public String LongDate;
public String ArrowFormat;
public String BarFormat;
public String OwnDatePattern;
public String PatternFormat;
public String NumberFmt;
public void Initialize() {
IsInitialized = true;
MediumDate = "";
ShortDate = "";
LongDate = "";
ArrowFormat = "";
BarFormat = "";
OwnDatePattern = "";
PatternFormat = "";
NumberFmt = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pagetype{
public boolean IsInitialized;
public String Enable;
public String Event;
public String Disable;
public void Initialize() {
IsInitialized = true;
Enable = "";
Event = "";
Disable = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _sorttype{
public boolean IsInitialized;
public String Enable;
public String Event;
public String Disable;
public void Initialize() {
IsInitialized = true;
Enable = "";
Event = "";
Disable = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _barformattype{
public boolean IsInitialized;
public long bfBase;
public String bfColorNegative;
public String bfColorPositive;
public boolean bfDrawZeroLine;
public long bfMax;
public long bfMin;
public boolean bfShowValue;
public int bfWidth;
public void Initialize() {
IsInitialized = true;
bfBase = 0L;
bfColorNegative = "";
bfColorPositive = "";
bfDrawZeroLine = false;
bfMax = 0L;
bfMin = 0L;
bfShowValue = false;
bfWidth = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _numberformattype{
public boolean IsInitialized;
public String decimalSymbol;
public String fractionDigits;
public String groupingSymbol;
public String negativeColor;
public boolean negativeParens;
public String pattern;
public String prefix;
public String suffix;
public void Initialize() {
IsInitialized = true;
decimalSymbol = "";
fractionDigits = "";
groupingSymbol = "";
negativeColor = "";
negativeParens = false;
pattern = "";
prefix = "";
suffix = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addcoloraxiscolors(String _scolor) throws Exception{
 //BA.debugLineNum = 842;BA.debugLine="Sub AddColorAxisColors(sColor As String)";
 //BA.debugLineNum = 843;BA.debugLine="ColorAxisColors.put(sColor,\"\")";
_coloraxiscolors.Put((Object)(_scolor),(Object)(""));
 //BA.debugLineNum = 844;BA.debugLine="End Sub";
return "";
}
public String  _addcolumn(String _columnname,String _columntype) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Public Sub AddColumn(ColumnName As String, ColumnT";
 //BA.debugLineNum = 390;BA.debugLine="FieldsAndTypes.Put(ColumnName, ColumnType)";
_fieldsandtypes.Put((Object)(_columnname),(Object)(_columntype));
 //BA.debugLineNum = 391;BA.debugLine="If MasterSeries.IndexOf(ColumnName) = -1 Then Mas";
if (_masterseries.IndexOf((Object)(_columnname))==-1) { 
_masterseries.Add((Object)(_columnname));};
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnbarformat(String _columnname,float _bfbase,String _bfcolornegative,String _bfcolorpositive,boolean _bfdrawzeroline,float _bfmax,float _bfmin,boolean _bfshowvalue,int _bfwidth) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cm = null;
 //BA.debugLineNum = 210;BA.debugLine="Sub AddColumnBarFormat(ColumnName As String, bfBas";
 //BA.debugLineNum = 211;BA.debugLine="ColumnFormats.Put(ColumnName, ColumnFormatEnum.Ba";
_columnformats.Put((Object)(_columnname),(Object)(_columnformatenum.BarFormat /*String*/ ));
 //BA.debugLineNum = 212;BA.debugLine="Dim cm As Map";
_cm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 213;BA.debugLine="cm.Initialize";
_cm.Initialize();
 //BA.debugLineNum = 214;BA.debugLine="cm.Put(\"base\", bfBase)";
_cm.Put((Object)("base"),(Object)(_bfbase));
 //BA.debugLineNum = 215;BA.debugLine="cm.Put(\"colornegative\", bfColorNegative)";
_cm.Put((Object)("colornegative"),(Object)(_bfcolornegative));
 //BA.debugLineNum = 216;BA.debugLine="cm.Put(\"colorpositive\", bfColorPositive)";
_cm.Put((Object)("colorpositive"),(Object)(_bfcolorpositive));
 //BA.debugLineNum = 217;BA.debugLine="cm.Put(\"drawzeroline\", bfDrawZeroLine)";
_cm.Put((Object)("drawzeroline"),(Object)(_bfdrawzeroline));
 //BA.debugLineNum = 218;BA.debugLine="cm.Put(\"max\", bfMax)";
_cm.Put((Object)("max"),(Object)(_bfmax));
 //BA.debugLineNum = 219;BA.debugLine="cm.Put(\"min\", bfMin)";
_cm.Put((Object)("min"),(Object)(_bfmin));
 //BA.debugLineNum = 220;BA.debugLine="cm.Put(\"showvalue\", bfShowValue)";
_cm.Put((Object)("showvalue"),(Object)(_bfshowvalue));
 //BA.debugLineNum = 221;BA.debugLine="cm.Put(\"width\", bfWidth)";
_cm.Put((Object)("width"),(Object)(_bfwidth));
 //BA.debugLineNum = 222;BA.debugLine="ColumnBarFormats.Put(ColumnName, cm)";
_columnbarformats.Put((Object)(_columnname),(Object)(_cm.getObject()));
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnformat(String _columnname,String _ccolumnformat) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub AddColumnFormat(ColumnName As String, cColumnF";
 //BA.debugLineNum = 186;BA.debugLine="ColumnFormats.Put(ColumnName, cColumnFormat)";
_columnformats.Put((Object)(_columnname),(Object)(_ccolumnformat));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnnumberformat(String _columnname,String _decimalsymbol,String _fractiondigits,String _groupingsymbol,String _negativecolor,boolean _negativeparens,String _pattern,String _prefix,String _suffix) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cm = null;
 //BA.debugLineNum = 229;BA.debugLine="Sub AddColumnNumberFormat(ColumnName As String, de";
 //BA.debugLineNum = 230;BA.debugLine="ColumnFormats.Put(ColumnName, ColumnFormatEnum.Nu";
_columnformats.Put((Object)(_columnname),(Object)(_columnformatenum.NumberFmt /*String*/ ));
 //BA.debugLineNum = 231;BA.debugLine="Dim cm As Map";
_cm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 232;BA.debugLine="cm.Initialize";
_cm.Initialize();
 //BA.debugLineNum = 233;BA.debugLine="cm.Put(\"decimalSymbol\", decimalSymbol)";
_cm.Put((Object)("decimalSymbol"),(Object)(_decimalsymbol));
 //BA.debugLineNum = 234;BA.debugLine="cm.Put(\"fractionDigits\", fractionDigits)";
_cm.Put((Object)("fractionDigits"),(Object)(_fractiondigits));
 //BA.debugLineNum = 235;BA.debugLine="cm.Put(\"groupingSymbol\", groupingSymbol)";
_cm.Put((Object)("groupingSymbol"),(Object)(_groupingsymbol));
 //BA.debugLineNum = 236;BA.debugLine="cm.Put(\"negativeColor\", negativeColor)";
_cm.Put((Object)("negativeColor"),(Object)(_negativecolor));
 //BA.debugLineNum = 237;BA.debugLine="cm.Put(\"negativeParens\", negativeParens)";
_cm.Put((Object)("negativeParens"),(Object)(_negativeparens));
 //BA.debugLineNum = 238;BA.debugLine="cm.Put(\"pattern\", pattern)";
_cm.Put((Object)("pattern"),(Object)(_pattern));
 //BA.debugLineNum = 239;BA.debugLine="cm.Put(\"prefix\", prefix)";
_cm.Put((Object)("prefix"),(Object)(_prefix));
 //BA.debugLineNum = 240;BA.debugLine="cm.Put(\"suffix\", suffix)";
_cm.Put((Object)("suffix"),(Object)(_suffix));
 //BA.debugLineNum = 241;BA.debugLine="ColumnNumberFormats.Put(ColumnName, cm)";
_columnnumberformats.Put((Object)(_columnname),(Object)(_cm.getObject()));
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnowndateformat(String _columnname,String _cpattern) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cm = null;
 //BA.debugLineNum = 189;BA.debugLine="Sub AddColumnOwnDateFormat(ColumnName As String, c";
 //BA.debugLineNum = 190;BA.debugLine="ColumnFormats.Put(ColumnName, ColumnFormatEnum.Ow";
_columnformats.Put((Object)(_columnname),(Object)(_columnformatenum.OwnDatePattern /*String*/ ));
 //BA.debugLineNum = 191;BA.debugLine="Dim cm As Map";
_cm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 192;BA.debugLine="cm.Initialize";
_cm.Initialize();
 //BA.debugLineNum = 193;BA.debugLine="cm.Put(\"pattern\", cPattern)";
_cm.Put((Object)("pattern"),(Object)(_cpattern));
 //BA.debugLineNum = 194;BA.debugLine="OwnPatterns.Put(ColumnName, cm)";
_ownpatterns.Put((Object)(_columnname),(Object)(_cm.getObject()));
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnpatternformat(String _columnname,String _cpattern) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cm = null;
 //BA.debugLineNum = 197;BA.debugLine="Sub AddColumnPatternFormat(ColumnName As String, c";
 //BA.debugLineNum = 198;BA.debugLine="ColumnFormats.Put(ColumnName, ColumnFormatEnum.Pa";
_columnformats.Put((Object)(_columnname),(Object)(_columnformatenum.PatternFormat /*String*/ ));
 //BA.debugLineNum = 199;BA.debugLine="Dim cm As Map";
_cm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 200;BA.debugLine="cm.Initialize";
_cm.Initialize();
 //BA.debugLineNum = 201;BA.debugLine="cm.Put(\"pattern\",QUOTE & cPattern & QUOTE)";
_cm.Put((Object)("pattern"),(Object)(__c.QUOTE+_cpattern+__c.QUOTE));
 //BA.debugLineNum = 202;BA.debugLine="OwnPatterns.Put(ColumnName, cm)";
_ownpatterns.Put((Object)(_columnname),(Object)(_cm.getObject()));
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnsxy(String _columnname,String _xvalue,String _yvalue) throws Exception{
boolean _xexists = false;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 870;BA.debugLine="Sub AddColumnsXY(ColumnName As String, XValue As S";
 //BA.debugLineNum = 872;BA.debugLine="If MasterSeries.IndexOf(ColumnName) = -1 Then Mas";
if (_masterseries.IndexOf((Object)(_columnname))==-1) { 
_masterseries.Add((Object)(_columnname));};
 //BA.debugLineNum = 874;BA.debugLine="Dim xExists As Boolean";
_xexists = false;
 //BA.debugLineNum = 875;BA.debugLine="xExists = mseries.ContainsKey(XValue)";
_xexists = _mseries.ContainsKey((Object)(_xvalue));
 //BA.debugLineNum = 876;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 877;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 878;BA.debugLine="If xExists = True Then";
if (_xexists==__c.True) { 
 //BA.debugLineNum = 880;BA.debugLine="M = mseries.Get(XValue)";
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mseries.Get((Object)(_xvalue))));
 //BA.debugLineNum = 881;BA.debugLine="If IsDateColumn(ColumnName) Then YValue = MakeDa";
if (_isdatecolumn(_columnname)) { 
_yvalue = _makedate(_yvalue);};
 //BA.debugLineNum = 882;BA.debugLine="If IsTimeColumn(ColumnName) Then YValue = MakeTi";
if (_istimecolumn(_columnname)) { 
_yvalue = _maketime(_yvalue);};
 //BA.debugLineNum = 883;BA.debugLine="M.Put(ColumnName, YValue)";
_m.Put((Object)(_columnname),(Object)(_yvalue));
 }else {
 //BA.debugLineNum = 886;BA.debugLine="If IsDateColumn(ColumnName) Then YValue = MakeDa";
if (_isdatecolumn(_columnname)) { 
_yvalue = _makedate(_yvalue);};
 //BA.debugLineNum = 887;BA.debugLine="If IsTimeColumn(ColumnName) Then YValue = MakeTi";
if (_istimecolumn(_columnname)) { 
_yvalue = _maketime(_yvalue);};
 //BA.debugLineNum = 888;BA.debugLine="M.Put(ColumnName, YValue)";
_m.Put((Object)(_columnname),(Object)(_yvalue));
 };
 //BA.debugLineNum = 891;BA.debugLine="mseries.Put(XValue, M)";
_mseries.Put((Object)(_xvalue),(Object)(_m.getObject()));
 //BA.debugLineNum = 892;BA.debugLine="mSeriesL.Add(M)";
_mseriesl.Add((Object)(_m.getObject()));
 //BA.debugLineNum = 893;BA.debugLine="End Sub";
return "";
}
public String  _addgauge(String _slabel,String _svalue) throws Exception{
String _skey = "";
String _sfld = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 846;BA.debugLine="Sub AddGauge(sLabel As String, sValue As String)";
 //BA.debugLineNum = 847;BA.debugLine="x.Add(sLabel)";
_x.Add((Object)(_slabel));
 //BA.debugLineNum = 848;BA.debugLine="y.Add(sValue)";
_y.Add((Object)(_svalue));
 //BA.debugLineNum = 849;BA.debugLine="If MasterSeries.Size = 2 Then";
if (_masterseries.getSize()==2) { 
 //BA.debugLineNum = 850;BA.debugLine="Dim sKey As String = MasterSeries.Get(0)";
_skey = BA.ObjectToString(_masterseries.Get((int) (0)));
 //BA.debugLineNum = 851;BA.debugLine="Dim sFld As String = MasterSeries.Get(1)";
_sfld = BA.ObjectToString(_masterseries.Get((int) (1)));
 //BA.debugLineNum = 852;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 853;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 854;BA.debugLine="M.Put(sKey, sLabel)";
_m.Put((Object)(_skey),(Object)(_slabel));
 //BA.debugLineNum = 855;BA.debugLine="M.Put(sFld, sValue)";
_m.Put((Object)(_sfld),(Object)(_svalue));
 //BA.debugLineNum = 856;BA.debugLine="AddRow(sLabel, M)";
_addrow(_slabel,_m);
 };
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return "";
}
public String  _addperson(String _fullname,String _jobtitle,String _reportsto,String _tooltipcolor,String _tooltipitalic) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowm = null;
 //BA.debugLineNum = 914;BA.debugLine="Sub AddPerson(FullName As String, JobTitle As Stri";
 //BA.debugLineNum = 915;BA.debugLine="Dim rowM As Map";
_rowm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 916;BA.debugLine="rowM.Initialize";
_rowm.Initialize();
 //BA.debugLineNum = 917;BA.debugLine="rowM.Put(\"Name\", FullName)";
_rowm.Put((Object)("Name"),(Object)(_fullname));
 //BA.debugLineNum = 918;BA.debugLine="rowM.Put(\"Manager\", ReportsTo)";
_rowm.Put((Object)("Manager"),(Object)(_reportsto));
 //BA.debugLineNum = 919;BA.debugLine="rowM.Put(\"ToolTip\", JobTitle)";
_rowm.Put((Object)("ToolTip"),(Object)(_jobtitle));
 //BA.debugLineNum = 920;BA.debugLine="rowM.Put(\"ToolTipColor\", ToolTipColor)";
_rowm.Put((Object)("ToolTipColor"),(Object)(_tooltipcolor));
 //BA.debugLineNum = 921;BA.debugLine="rowM.Put(\"ToolTipItalic\", ToolTipItalic)";
_rowm.Put((Object)("ToolTipItalic"),(Object)(_tooltipitalic));
 //BA.debugLineNum = 922;BA.debugLine="AddRow(FullName, rowM)";
_addrow(_fullname,_rowm);
 //BA.debugLineNum = 923;BA.debugLine="End Sub";
return "";
}
public String  _addrow(String _skey,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
int _i = 0;
 //BA.debugLineNum = 860;BA.debugLine="Sub AddRow(sKey As String, M As Map)";
 //BA.debugLineNum = 861;BA.debugLine="mseries.Put(sKey, M)";
_mseries.Put((Object)(_skey),(Object)(_m.getObject()));
 //BA.debugLineNum = 862;BA.debugLine="For i = 0 To M.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_m.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 863;BA.debugLine="Dim sKey As String = M.GetKeyAt(i)";
_skey = BA.ObjectToString(_m.GetKeyAt(_i));
 //BA.debugLineNum = 864;BA.debugLine="If MasterSeries.IndexOf(sKey) = -1 Then MasterSe";
if (_masterseries.IndexOf((Object)(_skey))==-1) { 
_masterseries.Add((Object)(_skey));};
 }
};
 //BA.debugLineNum = 867;BA.debugLine="mSeriesL.Add(M)";
_mseriesl.Add((Object)(_m.getObject()));
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return "";
}
public String  _addseriestype(int _serieslocation,String _sseriestype) throws Exception{
 //BA.debugLineNum = 838;BA.debugLine="Sub AddSeriesType(SeriesLocation As Int, sSeriesTy";
 //BA.debugLineNum = 839;BA.debugLine="SeriesTypes.put(SeriesLocation, sSeriesType)";
_seriestypes.Put((Object)(_serieslocation),(Object)(_sseriestype));
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return "";
}
public String  _addxy(Object _xvalue,Object _yvalue) throws Exception{
String _skey = "";
String _sfld = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 705;BA.debugLine="Sub AddXY(XValue As Object, YValue As Object)";
 //BA.debugLineNum = 706;BA.debugLine="x.Add(XValue)";
_x.Add(_xvalue);
 //BA.debugLineNum = 707;BA.debugLine="y.Add(YValue)";
_y.Add(_yvalue);
 //BA.debugLineNum = 708;BA.debugLine="If MasterSeries.Size = 2 Then";
if (_masterseries.getSize()==2) { 
 //BA.debugLineNum = 709;BA.debugLine="Dim sKey As String = MasterSeries.Get(0)";
_skey = BA.ObjectToString(_masterseries.Get((int) (0)));
 //BA.debugLineNum = 710;BA.debugLine="Dim sFld As String = MasterSeries.Get(1)";
_sfld = BA.ObjectToString(_masterseries.Get((int) (1)));
 //BA.debugLineNum = 712;BA.debugLine="If IsDateColumn(sKey) Then XValue = MakeDate(XVa";
if (_isdatecolumn(_skey)) { 
_xvalue = (Object)(_makedate(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 713;BA.debugLine="If IsDateColumn(sFld) Then YValue = MakeDate(YVa";
if (_isdatecolumn(_sfld)) { 
_yvalue = (Object)(_makedate(BA.ObjectToString(_yvalue)));};
 //BA.debugLineNum = 714;BA.debugLine="If IsTimeColumn(sKey) Then XValue = MakeTime(XVa";
if (_istimecolumn(_skey)) { 
_xvalue = (Object)(_maketime(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 715;BA.debugLine="If IsTimeColumn(sFld) Then YValue = MakeTime(YVa";
if (_istimecolumn(_sfld)) { 
_yvalue = (Object)(_maketime(BA.ObjectToString(_yvalue)));};
 //BA.debugLineNum = 716;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 717;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 718;BA.debugLine="M.Put(sKey, XValue)";
_m.Put((Object)(_skey),_xvalue);
 //BA.debugLineNum = 719;BA.debugLine="M.Put(sFld, YValue)";
_m.Put((Object)(_sfld),_yvalue);
 //BA.debugLineNum = 720;BA.debugLine="AddRow(XValue, M)";
_addrow(BA.ObjectToString(_xvalue),_m);
 };
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return "";
}
public String  _addxyy(Object _xvalue,Object _yvalue1,Object _yvalue2) throws Exception{
String _skey = "";
String _sfld0 = "";
String _sfld1 = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 725;BA.debugLine="Sub AddXYY(XValue As Object, YValue1 As Object, YV";
 //BA.debugLineNum = 726;BA.debugLine="If MasterSeries.Size = 3 Then";
if (_masterseries.getSize()==3) { 
 //BA.debugLineNum = 727;BA.debugLine="Dim sKey As String = MasterSeries.Get(0)";
_skey = BA.ObjectToString(_masterseries.Get((int) (0)));
 //BA.debugLineNum = 728;BA.debugLine="Dim sFld0 As String = MasterSeries.Get(1)";
_sfld0 = BA.ObjectToString(_masterseries.Get((int) (1)));
 //BA.debugLineNum = 729;BA.debugLine="Dim sFld1 As String = MasterSeries.Get(2)";
_sfld1 = BA.ObjectToString(_masterseries.Get((int) (2)));
 //BA.debugLineNum = 730;BA.debugLine="If IsDateColumn(sKey) Then XValue = MakeDate(XVa";
if (_isdatecolumn(_skey)) { 
_xvalue = (Object)(_makedate(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 731;BA.debugLine="If IsDateColumn(sFld0) Then YValue1 = MakeDate(Y";
if (_isdatecolumn(_sfld0)) { 
_yvalue1 = (Object)(_makedate(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 732;BA.debugLine="If IsDateColumn(sFld1) Then YValue2 = MakeDate(Y";
if (_isdatecolumn(_sfld1)) { 
_yvalue2 = (Object)(_makedate(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 734;BA.debugLine="If IsTimeColumn(sKey) Then XValue = MakeTime(XVa";
if (_istimecolumn(_skey)) { 
_xvalue = (Object)(_maketime(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 735;BA.debugLine="If IsTimeColumn(sFld0) Then YValue1 = MakeTime(Y";
if (_istimecolumn(_sfld0)) { 
_yvalue1 = (Object)(_maketime(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 736;BA.debugLine="If IsTimeColumn(sFld1) Then YValue2 = MakeTime(Y";
if (_istimecolumn(_sfld1)) { 
_yvalue2 = (Object)(_maketime(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 738;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 739;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 740;BA.debugLine="M.Put(sKey, XValue)";
_m.Put((Object)(_skey),_xvalue);
 //BA.debugLineNum = 741;BA.debugLine="M.Put(sFld0, YValue1)";
_m.Put((Object)(_sfld0),_yvalue1);
 //BA.debugLineNum = 742;BA.debugLine="M.Put(sFld1, YValue2)";
_m.Put((Object)(_sfld1),_yvalue2);
 //BA.debugLineNum = 743;BA.debugLine="AddRow(XValue, M)";
_addrow(BA.ObjectToString(_xvalue),_m);
 };
 //BA.debugLineNum = 745;BA.debugLine="End Sub";
return "";
}
public String  _addxyyy(Object _xvalue,Object _yvalue1,Object _yvalue2,Object _yvalue3) throws Exception{
String _skey = "";
String _sfld0 = "";
String _sfld1 = "";
String _sfld2 = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 748;BA.debugLine="Sub AddXYYY(XValue As Object, YValue1 As Object, Y";
 //BA.debugLineNum = 749;BA.debugLine="If MasterSeries.Size = 4 Then";
if (_masterseries.getSize()==4) { 
 //BA.debugLineNum = 750;BA.debugLine="Dim sKey As String = MasterSeries.Get(0)";
_skey = BA.ObjectToString(_masterseries.Get((int) (0)));
 //BA.debugLineNum = 751;BA.debugLine="Dim sFld0 As String = MasterSeries.Get(1)";
_sfld0 = BA.ObjectToString(_masterseries.Get((int) (1)));
 //BA.debugLineNum = 752;BA.debugLine="Dim sFld1 As String = MasterSeries.Get(2)";
_sfld1 = BA.ObjectToString(_masterseries.Get((int) (2)));
 //BA.debugLineNum = 753;BA.debugLine="Dim sFld2 As String = MasterSeries.Get(3)";
_sfld2 = BA.ObjectToString(_masterseries.Get((int) (3)));
 //BA.debugLineNum = 754;BA.debugLine="If IsDateColumn(sKey) Then XValue = MakeDate(XVa";
if (_isdatecolumn(_skey)) { 
_xvalue = (Object)(_makedate(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 755;BA.debugLine="If IsDateColumn(sFld0) Then YValue1 = MakeDate(Y";
if (_isdatecolumn(_sfld0)) { 
_yvalue1 = (Object)(_makedate(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 756;BA.debugLine="If IsDateColumn(sFld1) Then YValue2 = MakeDate(Y";
if (_isdatecolumn(_sfld1)) { 
_yvalue2 = (Object)(_makedate(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 757;BA.debugLine="If IsDateColumn(sFld2) Then YValue3 = MakeDate(Y";
if (_isdatecolumn(_sfld2)) { 
_yvalue3 = (Object)(_makedate(BA.ObjectToString(_yvalue3)));};
 //BA.debugLineNum = 759;BA.debugLine="If IsTimeColumn(sKey) Then XValue = MakeTime(XVa";
if (_istimecolumn(_skey)) { 
_xvalue = (Object)(_maketime(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 760;BA.debugLine="If IsTimeColumn(sFld0) Then YValue1 = MakeTime(Y";
if (_istimecolumn(_sfld0)) { 
_yvalue1 = (Object)(_maketime(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 761;BA.debugLine="If IsTimeColumn(sFld1) Then YValue2 = MakeTime(Y";
if (_istimecolumn(_sfld1)) { 
_yvalue2 = (Object)(_maketime(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 762;BA.debugLine="If IsTimeColumn(sFld2) Then YValue3 = MakeTime(Y";
if (_istimecolumn(_sfld2)) { 
_yvalue3 = (Object)(_maketime(BA.ObjectToString(_yvalue3)));};
 //BA.debugLineNum = 764;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 765;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 766;BA.debugLine="M.Put(sKey, XValue)";
_m.Put((Object)(_skey),_xvalue);
 //BA.debugLineNum = 767;BA.debugLine="M.Put(sFld0, YValue1)";
_m.Put((Object)(_sfld0),_yvalue1);
 //BA.debugLineNum = 768;BA.debugLine="M.Put(sFld1, YValue2)";
_m.Put((Object)(_sfld1),_yvalue2);
 //BA.debugLineNum = 769;BA.debugLine="M.Put(sFld2, YValue3)";
_m.Put((Object)(_sfld2),_yvalue3);
 //BA.debugLineNum = 770;BA.debugLine="AddRow(XValue, M)";
_addrow(BA.ObjectToString(_xvalue),_m);
 };
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return "";
}
public String  _addxyyyy(Object _xvalue,Object _yvalue1,Object _yvalue2,Object _yvalue3,Object _yvalue4) throws Exception{
String _skey = "";
String _sfld0 = "";
String _sfld1 = "";
String _sfld2 = "";
String _sfld3 = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 774;BA.debugLine="Sub AddXYYYY(XValue As Object, YValue1 As Object,";
 //BA.debugLineNum = 775;BA.debugLine="If MasterSeries.Size = 5 Then";
if (_masterseries.getSize()==5) { 
 //BA.debugLineNum = 776;BA.debugLine="Dim sKey As String = MasterSeries.Get(0)";
_skey = BA.ObjectToString(_masterseries.Get((int) (0)));
 //BA.debugLineNum = 777;BA.debugLine="Dim sFld0 As String = MasterSeries.Get(1)";
_sfld0 = BA.ObjectToString(_masterseries.Get((int) (1)));
 //BA.debugLineNum = 778;BA.debugLine="Dim sFld1 As String = MasterSeries.Get(2)";
_sfld1 = BA.ObjectToString(_masterseries.Get((int) (2)));
 //BA.debugLineNum = 779;BA.debugLine="Dim sFld2 As String = MasterSeries.Get(3)";
_sfld2 = BA.ObjectToString(_masterseries.Get((int) (3)));
 //BA.debugLineNum = 780;BA.debugLine="Dim sFld3 As String = MasterSeries.Get(4)";
_sfld3 = BA.ObjectToString(_masterseries.Get((int) (4)));
 //BA.debugLineNum = 781;BA.debugLine="If IsDateColumn(sKey) Then XValue = MakeDate(XVa";
if (_isdatecolumn(_skey)) { 
_xvalue = (Object)(_makedate(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 782;BA.debugLine="If IsDateColumn(sFld0) Then YValue1 = MakeDate(Y";
if (_isdatecolumn(_sfld0)) { 
_yvalue1 = (Object)(_makedate(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 783;BA.debugLine="If IsDateColumn(sFld1) Then YValue2 = MakeDate(Y";
if (_isdatecolumn(_sfld1)) { 
_yvalue2 = (Object)(_makedate(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 784;BA.debugLine="If IsDateColumn(sFld2) Then YValue3 = MakeDate(Y";
if (_isdatecolumn(_sfld2)) { 
_yvalue3 = (Object)(_makedate(BA.ObjectToString(_yvalue3)));};
 //BA.debugLineNum = 785;BA.debugLine="If IsDateColumn(sFld3) Then YValue4 = MakeDate(Y";
if (_isdatecolumn(_sfld3)) { 
_yvalue4 = (Object)(_makedate(BA.ObjectToString(_yvalue4)));};
 //BA.debugLineNum = 787;BA.debugLine="If IsTimeColumn(sKey) Then XValue = MakeTime(XVa";
if (_istimecolumn(_skey)) { 
_xvalue = (Object)(_maketime(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 788;BA.debugLine="If IsTimeColumn(sFld0) Then YValue1 = MakeTime(Y";
if (_istimecolumn(_sfld0)) { 
_yvalue1 = (Object)(_maketime(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 789;BA.debugLine="If IsTimeColumn(sFld1) Then YValue2 = MakeTime(Y";
if (_istimecolumn(_sfld1)) { 
_yvalue2 = (Object)(_maketime(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 790;BA.debugLine="If IsTimeColumn(sFld2) Then YValue3 = MakeTime(Y";
if (_istimecolumn(_sfld2)) { 
_yvalue3 = (Object)(_maketime(BA.ObjectToString(_yvalue3)));};
 //BA.debugLineNum = 791;BA.debugLine="If IsTimeColumn(sFld3) Then YValue4 = MakeTime(Y";
if (_istimecolumn(_sfld3)) { 
_yvalue4 = (Object)(_maketime(BA.ObjectToString(_yvalue4)));};
 //BA.debugLineNum = 793;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 794;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 795;BA.debugLine="M.Put(sKey, XValue)";
_m.Put((Object)(_skey),_xvalue);
 //BA.debugLineNum = 796;BA.debugLine="M.Put(sFld0, YValue1)";
_m.Put((Object)(_sfld0),_yvalue1);
 //BA.debugLineNum = 797;BA.debugLine="M.Put(sFld1, YValue2)";
_m.Put((Object)(_sfld1),_yvalue2);
 //BA.debugLineNum = 798;BA.debugLine="M.Put(sFld2, YValue3)";
_m.Put((Object)(_sfld2),_yvalue3);
 //BA.debugLineNum = 799;BA.debugLine="M.Put(sFld3, YValue4)";
_m.Put((Object)(_sfld3),_yvalue4);
 //BA.debugLineNum = 800;BA.debugLine="AddRow(XValue, M)";
_addrow(BA.ObjectToString(_xvalue),_m);
 };
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return "";
}
public String  _addxyyyyy(Object _xvalue,Object _yvalue1,Object _yvalue2,Object _yvalue3,Object _yvalue4,Object _yvalue5) throws Exception{
String _skey = "";
String _sfld0 = "";
String _sfld1 = "";
String _sfld2 = "";
String _sfld3 = "";
String _sfld4 = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 804;BA.debugLine="Sub AddXYYYYY(XValue As Object, YValue1 As Object,";
 //BA.debugLineNum = 805;BA.debugLine="If MasterSeries.Size = 6 Then";
if (_masterseries.getSize()==6) { 
 //BA.debugLineNum = 806;BA.debugLine="Dim sKey As String = MasterSeries.Get(0)";
_skey = BA.ObjectToString(_masterseries.Get((int) (0)));
 //BA.debugLineNum = 807;BA.debugLine="Dim sFld0 As String = MasterSeries.Get(1)";
_sfld0 = BA.ObjectToString(_masterseries.Get((int) (1)));
 //BA.debugLineNum = 808;BA.debugLine="Dim sFld1 As String = MasterSeries.Get(2)";
_sfld1 = BA.ObjectToString(_masterseries.Get((int) (2)));
 //BA.debugLineNum = 809;BA.debugLine="Dim sFld2 As String = MasterSeries.Get(3)";
_sfld2 = BA.ObjectToString(_masterseries.Get((int) (3)));
 //BA.debugLineNum = 810;BA.debugLine="Dim sFld3 As String = MasterSeries.Get(4)";
_sfld3 = BA.ObjectToString(_masterseries.Get((int) (4)));
 //BA.debugLineNum = 811;BA.debugLine="Dim sFld4 As String = MasterSeries.Get(5)";
_sfld4 = BA.ObjectToString(_masterseries.Get((int) (5)));
 //BA.debugLineNum = 812;BA.debugLine="If IsDateColumn(sKey) Then XValue = MakeDate(XVa";
if (_isdatecolumn(_skey)) { 
_xvalue = (Object)(_makedate(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 813;BA.debugLine="If IsDateColumn(sFld0) Then YValue1 = MakeDate(Y";
if (_isdatecolumn(_sfld0)) { 
_yvalue1 = (Object)(_makedate(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 814;BA.debugLine="If IsDateColumn(sFld1) Then YValue2 = MakeDate(Y";
if (_isdatecolumn(_sfld1)) { 
_yvalue2 = (Object)(_makedate(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 815;BA.debugLine="If IsDateColumn(sFld2) Then YValue3 = MakeDate(Y";
if (_isdatecolumn(_sfld2)) { 
_yvalue3 = (Object)(_makedate(BA.ObjectToString(_yvalue3)));};
 //BA.debugLineNum = 816;BA.debugLine="If IsDateColumn(sFld3) Then YValue4 = MakeDate(Y";
if (_isdatecolumn(_sfld3)) { 
_yvalue4 = (Object)(_makedate(BA.ObjectToString(_yvalue4)));};
 //BA.debugLineNum = 817;BA.debugLine="If IsDateColumn(sFld4) Then YValue5 = MakeDate(Y";
if (_isdatecolumn(_sfld4)) { 
_yvalue5 = (Object)(_makedate(BA.ObjectToString(_yvalue5)));};
 //BA.debugLineNum = 819;BA.debugLine="If IsTimeColumn(sKey) Then XValue = MakeTime(XVa";
if (_istimecolumn(_skey)) { 
_xvalue = (Object)(_maketime(BA.ObjectToString(_xvalue)));};
 //BA.debugLineNum = 820;BA.debugLine="If IsTimeColumn(sFld0) Then YValue1 = MakeTime(Y";
if (_istimecolumn(_sfld0)) { 
_yvalue1 = (Object)(_maketime(BA.ObjectToString(_yvalue1)));};
 //BA.debugLineNum = 821;BA.debugLine="If IsTimeColumn(sFld1) Then YValue2 = MakeTime(Y";
if (_istimecolumn(_sfld1)) { 
_yvalue2 = (Object)(_maketime(BA.ObjectToString(_yvalue2)));};
 //BA.debugLineNum = 822;BA.debugLine="If IsTimeColumn(sFld2) Then YValue3 = MakeTime(Y";
if (_istimecolumn(_sfld2)) { 
_yvalue3 = (Object)(_maketime(BA.ObjectToString(_yvalue3)));};
 //BA.debugLineNum = 823;BA.debugLine="If IsTimeColumn(sFld3) Then YValue4 = MakeTime(Y";
if (_istimecolumn(_sfld3)) { 
_yvalue4 = (Object)(_maketime(BA.ObjectToString(_yvalue4)));};
 //BA.debugLineNum = 824;BA.debugLine="If IsTimeColumn(sFld4) Then YValue5 = MakeTime(Y";
if (_istimecolumn(_sfld4)) { 
_yvalue5 = (Object)(_maketime(BA.ObjectToString(_yvalue5)));};
 //BA.debugLineNum = 826;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 827;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 828;BA.debugLine="M.Put(sKey, XValue)";
_m.Put((Object)(_skey),_xvalue);
 //BA.debugLineNum = 829;BA.debugLine="M.Put(sFld0, YValue1)";
_m.Put((Object)(_sfld0),_yvalue1);
 //BA.debugLineNum = 830;BA.debugLine="M.Put(sFld1, YValue2)";
_m.Put((Object)(_sfld1),_yvalue2);
 //BA.debugLineNum = 831;BA.debugLine="M.Put(sFld2, YValue3)";
_m.Put((Object)(_sfld2),_yvalue3);
 //BA.debugLineNum = 832;BA.debugLine="M.Put(sFld3, YValue4)";
_m.Put((Object)(_sfld3),_yvalue4);
 //BA.debugLineNum = 833;BA.debugLine="M.Put(sFld4, YValue5)";
_m.Put((Object)(_sfld4),_yvalue5);
 //BA.debugLineNum = 834;BA.debugLine="AddRow(XValue, M)";
_addrow(BA.ObjectToString(_xvalue),_m);
 };
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return "";
}
public String  _buildcoloraxis() throws Exception{
String _sheader = "";
int _i = 0;
 //BA.debugLineNum = 895;BA.debugLine="Sub BuildColorAxis() As String";
 //BA.debugLineNum = 896;BA.debugLine="Dim sHeader As String = \"\"";
_sheader = "";
 //BA.debugLineNum = 897;BA.debugLine="sHeader = \"[\"";
_sheader = "[";
 //BA.debugLineNum = 898;BA.debugLine="For i = 0 To ColorAxisColors.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_coloraxiscolors.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 899;BA.debugLine="If i > 0 Then sHeader = sHeader & \", \"";
if (_i>0) { 
_sheader = _sheader+", ";};
 //BA.debugLineNum = 900;BA.debugLine="sHeader = sHeader & \"'\" & ColorAxisColors.GetKey";
_sheader = _sheader+"'"+BA.ObjectToString(_coloraxiscolors.GetKeyAt(_i))+"'";
 }
};
 //BA.debugLineNum = 902;BA.debugLine="sHeader = sHeader & \"]\"";
_sheader = _sheader+"]";
 //BA.debugLineNum = 903;BA.debugLine="Return sHeader";
if (true) return _sheader;
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return "";
}
public String  _builddatatable() throws Exception{
com.simlog.clspb _clspb = null;
int _xy = 0;
int _i = 0;
String _field = "";
String _ftype = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _mrow = null;
String _field1 = "";
String _ftype1 = "";
Object _fvalue = null;
 //BA.debugLineNum = 245;BA.debugLine="Sub BuildDataTable() As String";
 //BA.debugLineNum = 247;BA.debugLine="Dim clsPB As clsPB";
_clspb = new com.simlog.clspb();
 //BA.debugLineNum = 248;BA.debugLine="Dim xy As Int = 0";
_xy = (int) (0);
 //BA.debugLineNum = 249;BA.debugLine="clsPB.Initialize";
_clspb._initialize /*String*/ (ba);
 //BA.debugLineNum = 250;BA.debugLine="clsPB.AppendLine(\"var data = new google.visualiza";
_clspb._appendline /*String*/ ("var data = new google.visualization.DataTable();");
 //BA.debugLineNum = 251;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 252;BA.debugLine="Dim field As String: field = FieldsAndTypes.GetK";
_field = "";
 //BA.debugLineNum = 252;BA.debugLine="Dim field As String: field = FieldsAndTypes.GetK";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
 //BA.debugLineNum = 253;BA.debugLine="Dim ftype As String: ftype = FieldsAndTypes.GetV";
_ftype = "";
 //BA.debugLineNum = 253;BA.debugLine="Dim ftype As String: ftype = FieldsAndTypes.GetV";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
 //BA.debugLineNum = 254;BA.debugLine="If ftype = DT_Time Then ftype = DT_Date";
if ((_ftype).equals(_dt_time)) { 
_ftype = _dt_date;};
 //BA.debugLineNum = 255;BA.debugLine="clsPB.AppendLine(\"data.addColumn('\" & ftype & \"'";
_clspb._appendline /*String*/ ("data.addColumn('"+_ftype+"', '"+_field+"');");
 }
};
 //BA.debugLineNum = 257;BA.debugLine="clsPB.AppendLine(\"data.addRows([\")";
_clspb._appendline /*String*/ ("data.addRows([");
 //BA.debugLineNum = 259;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 260;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 262;BA.debugLine="For i = 0 To mseries.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mseries.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 263;BA.debugLine="If i > 0 Then sb.Append(\",\" & CRLF)";
if (_i>0) { 
_sb.Append(","+__c.CRLF);};
 //BA.debugLineNum = 265;BA.debugLine="Dim mRow As Map";
_mrow = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 266;BA.debugLine="mRow.Initialize";
_mrow.Initialize();
 //BA.debugLineNum = 267;BA.debugLine="mRow = mseries.GetValueAt(i)";
_mrow = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mseries.GetValueAt(_i)));
 //BA.debugLineNum = 268;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
 //BA.debugLineNum = 270;BA.debugLine="For xy = 0 To FieldsAndTypes.Size - 1";
{
final int step22 = 1;
final int limit22 = (int) (_fieldsandtypes.getSize()-1);
_xy = (int) (0) ;
for (;_xy <= limit22 ;_xy = _xy + step22 ) {
 //BA.debugLineNum = 271;BA.debugLine="If xy > 0 Then sb.Append(\", \")";
if (_xy>0) { 
_sb.Append(", ");};
 //BA.debugLineNum = 272;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.G";
_field1 = "";
 //BA.debugLineNum = 272;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.G";
_field1 = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_xy));
 //BA.debugLineNum = 273;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.G";
_ftype1 = "";
 //BA.debugLineNum = 273;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.G";
_ftype1 = BA.ObjectToString(_fieldsandtypes.GetValueAt(_xy));
 //BA.debugLineNum = 274;BA.debugLine="Dim fValue As Object = mRow.Get(field1)";
_fvalue = _mrow.Get((Object)(_field1));
 //BA.debugLineNum = 275;BA.debugLine="If fValue = Null Then fValue = mseries.GetKeyAt";
if (_fvalue== null) { 
_fvalue = _mseries.GetKeyAt(_i);};
 //BA.debugLineNum = 276;BA.debugLine="Select Case ftype1";
switch (BA.switchObjectToInt(_ftype1,_dt_number,_dt_date,_dt_datetime,_dt_timeofday,_dt_boolean,_dt_time,_dt_string)) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 278;BA.debugLine="sb.Append(fValue)";
_sb.Append(BA.ObjectToString(_fvalue));
 break; }
case 6: {
 //BA.debugLineNum = 280;BA.debugLine="sb.Append(\"'\" & fValue & \"'\")";
_sb.Append("'"+BA.ObjectToString(_fvalue)+"'");
 break; }
}
;
 }
};
 //BA.debugLineNum = 283;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
 }
};
 //BA.debugLineNum = 285;BA.debugLine="clsPB.Append(sb.ToString)";
_clspb._append /*String*/ (_sb.ToString());
 //BA.debugLineNum = 286;BA.debugLine="clsPB.appendline(\"]);\")";
_clspb._appendline /*String*/ ("]);");
 //BA.debugLineNum = 287;BA.debugLine="Return clsPB.ToString";
if (true) return _clspb._tostring /*String*/ ();
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public String  _buildmaparray() throws Exception{
com.simlog.clspb _clspb = null;
int _xy = 0;
String _field = "";
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _mrow = null;
String _field1 = "";
String _ftype1 = "";
Object _fvalue = null;
 //BA.debugLineNum = 290;BA.debugLine="Sub BuildMapArray() As String";
 //BA.debugLineNum = 292;BA.debugLine="Dim clsPB As clsPB";
_clspb = new com.simlog.clspb();
 //BA.debugLineNum = 293;BA.debugLine="Dim xy As Int = 0";
_xy = (int) (0);
 //BA.debugLineNum = 294;BA.debugLine="Dim field As String";
_field = "";
 //BA.debugLineNum = 295;BA.debugLine="clsPB.Initialize";
_clspb._initialize /*String*/ (ba);
 //BA.debugLineNum = 296;BA.debugLine="clsPB.AppendLine(\"var data = google.visualization";
_clspb._appendline /*String*/ ("var data = google.visualization.arrayToDataTable([");
 //BA.debugLineNum = 297;BA.debugLine="clsPB.Append(\"[\")";
_clspb._append /*String*/ ("[");
 //BA.debugLineNum = 298;BA.debugLine="For i = 1 To FieldsAndTypes.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 299;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
 //BA.debugLineNum = 300;BA.debugLine="clsPB.append(\"'\" & field & \"', \")";
_clspb._append /*String*/ ("'"+_field+"', ");
 }
};
 //BA.debugLineNum = 302;BA.debugLine="field = FieldsAndTypes.GetKeyAt(0)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt((int) (0)));
 //BA.debugLineNum = 303;BA.debugLine="clsPB.append(\"'\" & field & \"'\")";
_clspb._append /*String*/ ("'"+_field+"'");
 //BA.debugLineNum = 304;BA.debugLine="clsPB.AppendLine(\"],\")";
_clspb._appendline /*String*/ ("],");
 //BA.debugLineNum = 306;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 307;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 309;BA.debugLine="For i = 0 To mseries.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mseries.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 310;BA.debugLine="If i > 0 Then sb.Append(\",\" & CRLF)";
if (_i>0) { 
_sb.Append(","+__c.CRLF);};
 //BA.debugLineNum = 312;BA.debugLine="Dim mRow As Map";
_mrow = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 313;BA.debugLine="mRow.Initialize";
_mrow.Initialize();
 //BA.debugLineNum = 314;BA.debugLine="mRow = mseries.GetValueAt(i)";
_mrow = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mseries.GetValueAt(_i)));
 //BA.debugLineNum = 315;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
 //BA.debugLineNum = 317;BA.debugLine="For xy = 1 To FieldsAndTypes.Size - 1";
{
final int step22 = 1;
final int limit22 = (int) (_fieldsandtypes.getSize()-1);
_xy = (int) (1) ;
for (;_xy <= limit22 ;_xy = _xy + step22 ) {
 //BA.debugLineNum = 318;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.G";
_field1 = "";
 //BA.debugLineNum = 318;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.G";
_field1 = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_xy));
 //BA.debugLineNum = 319;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.G";
_ftype1 = "";
 //BA.debugLineNum = 319;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.G";
_ftype1 = BA.ObjectToString(_fieldsandtypes.GetValueAt(_xy));
 //BA.debugLineNum = 320;BA.debugLine="Dim fValue As Object = mRow.Get(field1)";
_fvalue = _mrow.Get((Object)(_field1));
 //BA.debugLineNum = 321;BA.debugLine="If fValue = Null Then fValue = mseries.GetKeyAt";
if (_fvalue== null) { 
_fvalue = _mseries.GetKeyAt(_i);};
 //BA.debugLineNum = 322;BA.debugLine="Select Case ftype1";
switch (BA.switchObjectToInt(_ftype1,_dt_number,_dt_date,_dt_datetime,_dt_timeofday,_dt_boolean,_dt_time,_dt_string)) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 324;BA.debugLine="sb.Append(fValue)";
_sb.Append(BA.ObjectToString(_fvalue));
 break; }
case 6: {
 //BA.debugLineNum = 326;BA.debugLine="sb.Append(\"'\" & fValue & \"'\")";
_sb.Append("'"+BA.ObjectToString(_fvalue)+"'");
 break; }
}
;
 //BA.debugLineNum = 328;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 }
};
 //BA.debugLineNum = 330;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.Ge";
_field1 = "";
 //BA.debugLineNum = 330;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.Ge";
_field1 = BA.ObjectToString(_fieldsandtypes.GetKeyAt((int) (0)));
 //BA.debugLineNum = 331;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.Ge";
_ftype1 = "";
 //BA.debugLineNum = 331;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.Ge";
_ftype1 = BA.ObjectToString(_fieldsandtypes.GetValueAt((int) (0)));
 //BA.debugLineNum = 332;BA.debugLine="Dim fValue As Object = mRow.Get(field1)";
_fvalue = _mrow.Get((Object)(_field1));
 //BA.debugLineNum = 333;BA.debugLine="If fValue = Null Then fValue = mseries.GetKeyAt(";
if (_fvalue== null) { 
_fvalue = _mseries.GetKeyAt(_i);};
 //BA.debugLineNum = 334;BA.debugLine="Select Case ftype1";
switch (BA.switchObjectToInt(_ftype1,_dt_number,_dt_date,_dt_datetime,_dt_timeofday,_dt_boolean,_dt_time,_dt_string)) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 336;BA.debugLine="sb.Append(fValue)";
_sb.Append(BA.ObjectToString(_fvalue));
 break; }
case 6: {
 //BA.debugLineNum = 338;BA.debugLine="sb.Append(\"'\" & fValue & \"'\")";
_sb.Append("'"+BA.ObjectToString(_fvalue)+"'");
 break; }
}
;
 //BA.debugLineNum = 340;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
 }
};
 //BA.debugLineNum = 342;BA.debugLine="clsPB.Append(sb.ToString)";
_clspb._append /*String*/ (_sb.ToString());
 //BA.debugLineNum = 343;BA.debugLine="clsPB.appendline(\"]);\")";
_clspb._appendline /*String*/ ("]);");
 //BA.debugLineNum = 344;BA.debugLine="Return clsPB.ToString";
if (true) return _clspb._tostring /*String*/ ();
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return "";
}
public String  _buildorgchart() throws Exception{
com.simlog.clspb _clspb = null;
int _i = 0;
String _field = "";
String _ftype = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sname = "";
String _smanager = "";
String _stooltip = "";
String _stooltipcolor = "";
String _stooltipitalic = "";
String _sline = "";
 //BA.debugLineNum = 349;BA.debugLine="Sub BuildOrgChart() As String";
 //BA.debugLineNum = 351;BA.debugLine="Dim clsPB As clsPB";
_clspb = new com.simlog.clspb();
 //BA.debugLineNum = 352;BA.debugLine="clsPB.Initialize";
_clspb._initialize /*String*/ (ba);
 //BA.debugLineNum = 353;BA.debugLine="clsPB.AppendLine(\"var data = new google.visualiza";
_clspb._appendline /*String*/ ("var data = new google.visualization.DataTable();");
 //BA.debugLineNum = 354;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 355;BA.debugLine="Dim Field As String: Field = FieldsAndTypes.GetK";
_field = "";
 //BA.debugLineNum = 355;BA.debugLine="Dim Field As String: Field = FieldsAndTypes.GetK";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
 //BA.debugLineNum = 356;BA.debugLine="Dim ftype As String: ftype = FieldsAndTypes.GetV";
_ftype = "";
 //BA.debugLineNum = 356;BA.debugLine="Dim ftype As String: ftype = FieldsAndTypes.GetV";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
 //BA.debugLineNum = 357;BA.debugLine="If ftype = DT_Time Then ftype = DT_Date";
if ((_ftype).equals(_dt_time)) { 
_ftype = _dt_date;};
 //BA.debugLineNum = 358;BA.debugLine="If Field = \"ToolTipColor\" OR Field = \"ToolTipIta";
if ((_field).equals("ToolTipColor") || (_field).equals("ToolTipItalic")) { 
 }else {
 //BA.debugLineNum = 360;BA.debugLine="clsPB.AppendLine(\"data.addColumn('\" & ftype & \"";
_clspb._appendline /*String*/ ("data.addColumn('"+_ftype+"', '"+_field+"');");
 };
 }
};
 //BA.debugLineNum = 363;BA.debugLine="clsPB.AppendLine(\"data.addRows([\")";
_clspb._appendline /*String*/ ("data.addRows([");
 //BA.debugLineNum = 365;BA.debugLine="For i = 0 To mseries.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mseries.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 366;BA.debugLine="If i > 0 Then clsPB.Append(\",\")";
if (_i>0) { 
_clspb._append /*String*/ (",");};
 //BA.debugLineNum = 367;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 368;BA.debugLine="M.Initialize";
_m.Initialize();
 //BA.debugLineNum = 369;BA.debugLine="M = mseries.GetValueAt(i)";
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mseries.GetValueAt(_i)));
 //BA.debugLineNum = 370;BA.debugLine="Dim sName As String: sName = M.Get(\"Name\")";
_sname = "";
 //BA.debugLineNum = 370;BA.debugLine="Dim sName As String: sName = M.Get(\"Name\")";
_sname = BA.ObjectToString(_m.Get((Object)("Name")));
 //BA.debugLineNum = 371;BA.debugLine="Dim sManager As String: sManager = M.Get(\"Manage";
_smanager = "";
 //BA.debugLineNum = 371;BA.debugLine="Dim sManager As String: sManager = M.Get(\"Manage";
_smanager = BA.ObjectToString(_m.Get((Object)("Manager")));
 //BA.debugLineNum = 372;BA.debugLine="Dim sToolTip As String: sToolTip = M.Get(\"ToolTi";
_stooltip = "";
 //BA.debugLineNum = 372;BA.debugLine="Dim sToolTip As String: sToolTip = M.Get(\"ToolTi";
_stooltip = BA.ObjectToString(_m.Get((Object)("ToolTip")));
 //BA.debugLineNum = 373;BA.debugLine="Dim sToolTipColor As String: sToolTipColor = M.G";
_stooltipcolor = "";
 //BA.debugLineNum = 373;BA.debugLine="Dim sToolTipColor As String: sToolTipColor = M.G";
_stooltipcolor = BA.ObjectToString(_m.Get((Object)("ToolTipColor")));
 //BA.debugLineNum = 374;BA.debugLine="Dim sToolTipItalic As String: sToolTipItalic = M";
_stooltipitalic = "";
 //BA.debugLineNum = 374;BA.debugLine="Dim sToolTipItalic As String: sToolTipItalic = M";
_stooltipitalic = BA.ObjectToString(_m.Get((Object)("ToolTipItalic")));
 //BA.debugLineNum = 375;BA.debugLine="Dim sLine As String = \"\"";
_sline = "";
 //BA.debugLineNum = 376;BA.debugLine="If sToolTipItalic.ToLowerCase = \"y\" Then sToolTi";
if ((_stooltipitalic.toLowerCase()).equals("y")) { 
_stooltipitalic = "italic";};
 //BA.debugLineNum = 377;BA.debugLine="If sToolTipItalic.tolowercase = \"N\" Then sToolTi";
if ((_stooltipitalic.toLowerCase()).equals("N")) { 
_stooltipitalic = "normal";};
 //BA.debugLineNum = 378;BA.debugLine="sLine = \"[{v:'\" & sName & \"', f:'\" & sName";
_sline = "[{v:'"+_sname+"', f:'"+_sname;
 //BA.debugLineNum = 379;BA.debugLine="sLine = sLine & \"<div style=\" & QUOTE & \"color:\"";
_sline = _sline+"<div style="+__c.QUOTE+"color:"+_stooltipcolor;
 //BA.debugLineNum = 380;BA.debugLine="sLine = sLine & \"; font-style:\" & sToolTipItalic";
_sline = _sline+"; font-style:"+_stooltipitalic+__c.QUOTE+">"+_stooltip;
 //BA.debugLineNum = 381;BA.debugLine="sLine = sLine & \"</div>'}, '\" & sManager & \"', '";
_sline = _sline+"</div>'}, '"+_smanager+"', '"+_stooltip+"']";
 //BA.debugLineNum = 382;BA.debugLine="clsPB.AppendLine(sLine)";
_clspb._appendline /*String*/ (_sline);
 }
};
 //BA.debugLineNum = 384;BA.debugLine="clsPB.appendline(\"]);\")";
_clspb._appendline /*String*/ ("]);");
 //BA.debugLineNum = 385;BA.debugLine="Return clsPB.ToString";
if (true) return _clspb._tostring /*String*/ ();
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return "";
}
public String  _buildtimeline() throws Exception{
com.simlog.clspb _clspb = null;
int _xy = 0;
int _i = 0;
String _field = "";
String _ftype = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _mrow = null;
String _field1 = "";
String _ftype1 = "";
Object _fvalue = null;
 //BA.debugLineNum = 1317;BA.debugLine="Sub BuildTimeLine() As String";
 //BA.debugLineNum = 1319;BA.debugLine="Dim clsPB As clsPB";
_clspb = new com.simlog.clspb();
 //BA.debugLineNum = 1320;BA.debugLine="Dim xy As Int = 0";
_xy = (int) (0);
 //BA.debugLineNum = 1321;BA.debugLine="clsPB.Initialize";
_clspb._initialize /*String*/ (ba);
 //BA.debugLineNum = 1322;BA.debugLine="clsPB.AppendLine(\"var data = new google.visualiza";
_clspb._appendline /*String*/ ("var data = new google.visualization.DataTable();");
 //BA.debugLineNum = 1323;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 1324;BA.debugLine="Dim field As String: field = FieldsAndTypes.GetK";
_field = "";
 //BA.debugLineNum = 1324;BA.debugLine="Dim field As String: field = FieldsAndTypes.GetK";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
 //BA.debugLineNum = 1325;BA.debugLine="Dim ftype As String: ftype = FieldsAndTypes.GetV";
_ftype = "";
 //BA.debugLineNum = 1325;BA.debugLine="Dim ftype As String: ftype = FieldsAndTypes.GetV";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
 //BA.debugLineNum = 1326;BA.debugLine="If ftype = DT_Time Then ftype = DT_Date";
if ((_ftype).equals(_dt_time)) { 
_ftype = _dt_date;};
 //BA.debugLineNum = 1327;BA.debugLine="clsPB.AppendLine(\"data.addColumn({ type: '\" & ft";
_clspb._appendline /*String*/ ("data.addColumn({ type: '"+_ftype+"', id: '"+_field+"'});");
 }
};
 //BA.debugLineNum = 1329;BA.debugLine="clsPB.AppendLine(\"data.addRows([\")";
_clspb._appendline /*String*/ ("data.addRows([");
 //BA.debugLineNum = 1331;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1332;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1334;BA.debugLine="For i = 0 To mSeriesL.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mseriesl.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 1335;BA.debugLine="If i > 0 Then sb.Append(\",\" & CRLF)";
if (_i>0) { 
_sb.Append(","+__c.CRLF);};
 //BA.debugLineNum = 1337;BA.debugLine="Dim mRow As Map";
_mrow = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1338;BA.debugLine="mRow.Initialize";
_mrow.Initialize();
 //BA.debugLineNum = 1339;BA.debugLine="mRow = mSeriesL.Get(i)";
_mrow = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mseriesl.Get(_i)));
 //BA.debugLineNum = 1340;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
 //BA.debugLineNum = 1342;BA.debugLine="For xy = 0 To FieldsAndTypes.Size - 1";
{
final int step22 = 1;
final int limit22 = (int) (_fieldsandtypes.getSize()-1);
_xy = (int) (0) ;
for (;_xy <= limit22 ;_xy = _xy + step22 ) {
 //BA.debugLineNum = 1343;BA.debugLine="If xy > 0 Then sb.Append(\", \")";
if (_xy>0) { 
_sb.Append(", ");};
 //BA.debugLineNum = 1344;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.G";
_field1 = "";
 //BA.debugLineNum = 1344;BA.debugLine="Dim field1 As String: field1 = FieldsAndTypes.G";
_field1 = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_xy));
 //BA.debugLineNum = 1345;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.G";
_ftype1 = "";
 //BA.debugLineNum = 1345;BA.debugLine="Dim ftype1 As String: ftype1 = FieldsAndTypes.G";
_ftype1 = BA.ObjectToString(_fieldsandtypes.GetValueAt(_xy));
 //BA.debugLineNum = 1346;BA.debugLine="Dim fValue As Object = mRow.Get(field1)";
_fvalue = _mrow.Get((Object)(_field1));
 //BA.debugLineNum = 1347;BA.debugLine="If fValue = Null Then fValue = mseries.GetKeyAt";
if (_fvalue== null) { 
_fvalue = _mseries.GetKeyAt(_i);};
 //BA.debugLineNum = 1348;BA.debugLine="Select Case ftype1";
switch (BA.switchObjectToInt(_ftype1,_dt_number,_dt_date,_dt_datetime,_dt_timeofday,_dt_boolean,_dt_time,_dt_string)) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 1350;BA.debugLine="sb.Append(fValue)";
_sb.Append(BA.ObjectToString(_fvalue));
 break; }
case 6: {
 //BA.debugLineNum = 1352;BA.debugLine="sb.Append(\"'\" & fValue & \"'\")";
_sb.Append("'"+BA.ObjectToString(_fvalue)+"'");
 break; }
}
;
 }
};
 //BA.debugLineNum = 1355;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
 }
};
 //BA.debugLineNum = 1357;BA.debugLine="clsPB.Append(sb.ToString)";
_clspb._append /*String*/ (_sb.ToString());
 //BA.debugLineNum = 1358;BA.debugLine="clsPB.appendline(\"]);\")";
_clspb._appendline /*String*/ ("]);");
 //BA.debugLineNum = 1359;BA.debugLine="Return clsPB.ToString";
if (true) return _clspb._tostring /*String*/ ();
 //BA.debugLineNum = 1360;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Type focusTargetType(datum As String, category As";
;
 //BA.debugLineNum = 6;BA.debugLine="Public focusTargetEnum As focusTargetType";
_focustargetenum = new com.simlog.clsgooglechart._focustargettype();
 //BA.debugLineNum = 7;BA.debugLine="Public focusTarget As String";
_focustarget = "";
 //BA.debugLineNum = 8;BA.debugLine="Type curveTypeType(None As String, Function As St";
;
 //BA.debugLineNum = 9;BA.debugLine="Public curveTypeEnum As curveTypeType";
_curvetypeenum = new com.simlog.clsgooglechart._curvetypetype();
 //BA.debugLineNum = 10;BA.debugLine="Public curveType As String";
_curvetype = "";
 //BA.debugLineNum = 11;BA.debugLine="Type axisTitlesPositionType(AxisIn As String, Axi";
;
 //BA.debugLineNum = 12;BA.debugLine="Public axisTitlesPositionEnum As axisTitlesPositi";
_axistitlespositionenum = new com.simlog.clsgooglechart._axistitlespositiontype();
 //BA.debugLineNum = 13;BA.debugLine="Public axisTitlesPosition As String";
_axistitlesposition = "";
 //BA.debugLineNum = 14;BA.debugLine="Public hAxisslantedTextAngle As Int";
_haxisslantedtextangle = 0;
 //BA.debugLineNum = 15;BA.debugLine="Public hAxisslantedText As Boolean";
_haxisslantedtext = false;
 //BA.debugLineNum = 16;BA.debugLine="Public ZoomLevel As Int";
_zoomlevel = 0;
 //BA.debugLineNum = 17;BA.debugLine="Public useMapTypeControl As Boolean";
_usemaptypecontrol = false;
 //BA.debugLineNum = 18;BA.debugLine="Public lineColor As String";
_linecolor = "";
 //BA.debugLineNum = 19;BA.debugLine="Public lineWidth As Int";
_linewidth = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public DT_String As String";
_dt_string = "";
 //BA.debugLineNum = 21;BA.debugLine="Public DT_Number As String";
_dt_number = "";
 //BA.debugLineNum = 22;BA.debugLine="Public DT_Date As String";
_dt_date = "";
 //BA.debugLineNum = 23;BA.debugLine="Public DT_DateTime As String";
_dt_datetime = "";
 //BA.debugLineNum = 24;BA.debugLine="Public DT_TimeOfDay As String";
_dt_timeofday = "";
 //BA.debugLineNum = 25;BA.debugLine="Public DT_Boolean As String";
_dt_boolean = "";
 //BA.debugLineNum = 26;BA.debugLine="Public DT_Time As String";
_dt_time = "";
 //BA.debugLineNum = 27;BA.debugLine="Public rtlTable As Boolean";
_rtltable = false;
 //BA.debugLineNum = 28;BA.debugLine="Public showLine As Boolean";
_showline = false;
 //BA.debugLineNum = 29;BA.debugLine="Public AnimationDuration As Int";
_animationduration = 0;
 //BA.debugLineNum = 30;BA.debugLine="Public enableScrollWheel As Boolean";
_enablescrollwheel = false;
 //BA.debugLineNum = 31;BA.debugLine="Public showTip As Boolean";
_showtip = false;
 //BA.debugLineNum = 32;BA.debugLine="Public avoidOverlappingGridLines As Boolean";
_avoidoverlappinggridlines = false;
 //BA.debugLineNum = 33;BA.debugLine="Public XAxis As String  ' define the x axis title";
_xaxis = "";
 //BA.debugLineNum = 34;BA.debugLine="Public YAxis As String	' define the y axis title";
_yaxis = "";
 //BA.debugLineNum = 35;BA.debugLine="Private X As List		' the x values";
_x = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 36;BA.debugLine="Private Y As List		' the y values";
_y = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 37;BA.debugLine="Public Title As String	' the title of the chart";
_title = "";
 //BA.debugLineNum = 38;BA.debugLine="Public Width As String		' the width of the chart";
_width = "";
 //BA.debugLineNum = 39;BA.debugLine="Public Height As String	' the height of the class";
_height = "";
 //BA.debugLineNum = 40;BA.debugLine="Public pageSize As Int";
_pagesize = 0;
 //BA.debugLineNum = 41;BA.debugLine="Public backgroundColorInHex As String";
_backgroundcolorinhex = "";
 //BA.debugLineNum = 42;BA.debugLine="Public sortColumn As Int";
_sortcolumn = 0;
 //BA.debugLineNum = 43;BA.debugLine="Public showRowLabels As Boolean";
_showrowlabels = false;
 //BA.debugLineNum = 44;BA.debugLine="Public singleColorInHex As String";
_singlecolorinhex = "";
 //BA.debugLineNum = 45;BA.debugLine="Public groupByRowLabel As Boolean";
_groupbyrowlabel = false;
 //BA.debugLineNum = 46;BA.debugLine="Public colorByRowLabel As Boolean";
_colorbyrowlabel = false;
 //BA.debugLineNum = 47;BA.debugLine="Public Region As String";
_region = "";
 //BA.debugLineNum = 48;BA.debugLine="Public allowCollapse As Boolean";
_allowcollapse = false;
 //BA.debugLineNum = 49;BA.debugLine="Public sortAscending As Boolean";
_sortascending = false;
 //BA.debugLineNum = 50;BA.debugLine="Public Top As String";
_top = "";
 //BA.debugLineNum = 51;BA.debugLine="Public Left As String";
_left = "";
 //BA.debugLineNum = 52;BA.debugLine="Public firstRowNumber As Int";
_firstrownumber = 0;
 //BA.debugLineNum = 53;BA.debugLine="Public isStacked As Boolean";
_isstacked = false;
 //BA.debugLineNum = 54;BA.debugLine="Public allowHtml As Boolean";
_allowhtml = false;
 //BA.debugLineNum = 55;BA.debugLine="Public startPage As Int";
_startpage = 0;
 //BA.debugLineNum = 56;BA.debugLine="Public HTML As String	' the html code for the cha";
_html = "";
 //BA.debugLineNum = 57;BA.debugLine="Public SaveToo As Boolean";
_savetoo = false;
 //BA.debugLineNum = 58;BA.debugLine="Public DetectClick As Boolean";
_detectclick = false;
 //BA.debugLineNum = 59;BA.debugLine="Public BubbleFontSize As Int";
_bubblefontsize = 0;
 //BA.debugLineNum = 60;BA.debugLine="Public MasterSeries As List";
_masterseries = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 61;BA.debugLine="Public showRowNumber As Boolean";
_showrownumber = false;
 //BA.debugLineNum = 62;BA.debugLine="Public hAxisTitle As String";
_haxistitle = "";
 //BA.debugLineNum = 63;BA.debugLine="Public vAxisTitle As String";
_vaxistitle = "";
 //BA.debugLineNum = 64;BA.debugLine="Public alternatingRowStyle As Boolean";
_alternatingrowstyle = false;
 //BA.debugLineNum = 65;BA.debugLine="Public keepAspectRatio As Boolean";
_keepaspectratio = false;
 //BA.debugLineNum = 66;BA.debugLine="Public nodeClass As String";
_nodeclass = "";
 //BA.debugLineNum = 67;BA.debugLine="Public selectedNodeClass As String";
_selectednodeclass = "";
 //BA.debugLineNum = 68;BA.debugLine="Public enableRegionInteractivity As Boolean";
_enableregioninteractivity = false;
 //BA.debugLineNum = 69;BA.debugLine="Public magnifyingGlassEnable As Boolean";
_magnifyingglassenable = false;
 //BA.debugLineNum = 70;BA.debugLine="Public hAxisMaxValue As Double";
_haxismaxvalue = 0;
 //BA.debugLineNum = 71;BA.debugLine="Public hAxisMinValue As Double";
_haxisminvalue = 0;
 //BA.debugLineNum = 72;BA.debugLine="Public vAxisMaxValue As Double";
_vaxismaxvalue = 0;
 //BA.debugLineNum = 73;BA.debugLine="Public vAxisMinValue As Double";
_vaxisminvalue = 0;
 //BA.debugLineNum = 74;BA.debugLine="Public magnifyingGlassZoomFactor As Double";
_magnifyingglasszoomfactor = 0;
 //BA.debugLineNum = 75;BA.debugLine="Type DataTypeType(DT_String As String,DT_Number A";
;
 //BA.debugLineNum = 76;BA.debugLine="Public DataTypeEnum As DataTypeType";
_datatypeenum = new com.simlog.clsgooglechart._datatypetype();
 //BA.debugLineNum = 78;BA.debugLine="Type AnimationEasingType(AELinear As String, AEIn";
;
 //BA.debugLineNum = 79;BA.debugLine="Public AnimationEasingEnum As AnimationEasingType";
_animationeasingenum = new com.simlog.clsgooglechart._animationeasingtype();
 //BA.debugLineNum = 80;BA.debugLine="Public AnimationEasing As String";
_animationeasing = "";
 //BA.debugLineNum = 81;BA.debugLine="Type SeriesType1(Line As String, Area As String,";
;
 //BA.debugLineNum = 82;BA.debugLine="Public SeriesTypeEnum As SeriesType1";
_seriestypeenum = new com.simlog.clsgooglechart._seriestype1();
 //BA.debugLineNum = 83;BA.debugLine="Public SeriesType As String";
_seriestype = "";
 //BA.debugLineNum = 84;BA.debugLine="Type PieSliceTextType(IsPercentage As String, IsV";
;
 //BA.debugLineNum = 85;BA.debugLine="Public PieSliceTextEnum As PieSliceTextType";
_pieslicetextenum = new com.simlog.clsgooglechart._pieslicetexttype();
 //BA.debugLineNum = 86;BA.debugLine="Public PieSliceText As String";
_pieslicetext = "";
 //BA.debugLineNum = 87;BA.debugLine="Type LegendAlignmentType (AtStart As String, AtCe";
;
 //BA.debugLineNum = 88;BA.debugLine="Public LegendAlignmentEnum As LegendAlignmentType";
_legendalignmentenum = new com.simlog.clsgooglechart._legendalignmenttype();
 //BA.debugLineNum = 89;BA.debugLine="Public LegendAlignment As String";
_legendalignment = "";
 //BA.debugLineNum = 90;BA.debugLine="Type LegendPositionType(Top As String, Left As St";
;
 //BA.debugLineNum = 91;BA.debugLine="Public LegendPositionEnum As LegendPositionType";
_legendpositionenum = new com.simlog.clsgooglechart._legendpositiontype();
 //BA.debugLineNum = 92;BA.debugLine="Public LegendPosition As String";
_legendposition = "";
 //BA.debugLineNum = 93;BA.debugLine="Type ChartsType(PieChart As String, LineChart As";
;
 //BA.debugLineNum = 94;BA.debugLine="Public ChartTypeEnum As ChartsType";
_charttypeenum = new com.simlog.clsgooglechart._chartstype();
 //BA.debugLineNum = 95;BA.debugLine="Public ChartType As String";
_charttype = "";
 //BA.debugLineNum = 96;BA.debugLine="Type DisplayModeType(Auto As String, Regions As S";
;
 //BA.debugLineNum = 97;BA.debugLine="Public DisplayModeTypeEnum As DisplayModeType";
_displaymodetypeenum = new com.simlog.clsgooglechart._displaymodetype();
 //BA.debugLineNum = 98;BA.debugLine="Public DisplayMode As String";
_displaymode = "";
 //BA.debugLineNum = 99;BA.debugLine="Type ResolutionType(Countries As String, Province";
;
 //BA.debugLineNum = 100;BA.debugLine="Public ResolutionTypeEnum As ResolutionType";
_resolutiontypeenum = new com.simlog.clsgooglechart._resolutiontype();
 //BA.debugLineNum = 101;BA.debugLine="Public Resolution As String";
_resolution = "";
 //BA.debugLineNum = 102;BA.debugLine="Type MapTypeType(Normal As String, Terrain As Str";
;
 //BA.debugLineNum = 103;BA.debugLine="Public MapTypeEnum As MapTypeType";
_maptypeenum = new com.simlog.clsgooglechart._maptypetype();
 //BA.debugLineNum = 104;BA.debugLine="Public MapType As String";
_maptype = "";
 //BA.debugLineNum = 105;BA.debugLine="Type NodeSizeType(NodeSmall As String, NodeMedium";
;
 //BA.debugLineNum = 106;BA.debugLine="Type ZoomLevelType(Automatic As String, Number As";
;
 //BA.debugLineNum = 107;BA.debugLine="Public ZoomLevelEnum As ZoomLevelType";
_zoomlevelenum = new com.simlog.clsgooglechart._zoomleveltype();
 //BA.debugLineNum = 108;BA.debugLine="Public ZoomLevelOf As String";
_zoomlevelof = "";
 //BA.debugLineNum = 109;BA.debugLine="Public ZoomLevel As Int";
_zoomlevel = 0;
 //BA.debugLineNum = 110;BA.debugLine="Public NodeSizeEnum As NodeSizeType";
_nodesizeenum = new com.simlog.clsgooglechart._nodesizetype();
 //BA.debugLineNum = 111;BA.debugLine="Public NodeSize As String";
_nodesize = "";
 //BA.debugLineNum = 113;BA.debugLine="Type ColumnFormatType(MediumDate As String, Short";
;
 //BA.debugLineNum = 114;BA.debugLine="Public ColumnFormatEnum As ColumnFormatType";
_columnformatenum = new com.simlog.clsgooglechart._columnformattype();
 //BA.debugLineNum = 115;BA.debugLine="Public ColumnFormat As String";
_columnformat = "";
 //BA.debugLineNum = 117;BA.debugLine="Type PageType(Enable As String, Event As String,";
;
 //BA.debugLineNum = 118;BA.debugLine="Public PageEnum As PageType";
_pageenum = new com.simlog.clsgooglechart._pagetype();
 //BA.debugLineNum = 119;BA.debugLine="Public Page As String";
_page = "";
 //BA.debugLineNum = 120;BA.debugLine="Type SortType(Enable As String, Event As String,";
;
 //BA.debugLineNum = 121;BA.debugLine="Public SortEnum As SortType";
_sortenum = new com.simlog.clsgooglechart._sorttype();
 //BA.debugLineNum = 123;BA.debugLine="Type BarFormatType(bfBase As Long, bfColorNegativ";
;
 //BA.debugLineNum = 124;BA.debugLine="Public BarFormatOption As BarFormatType";
_barformatoption = new com.simlog.clsgooglechart._barformattype();
 //BA.debugLineNum = 126;BA.debugLine="Type NumberFormatType(decimalSymbol As String, fr";
;
 //BA.debugLineNum = 127;BA.debugLine="Public NumberFormatOption As NumberFormatType";
_numberformatoption = new com.simlog.clsgooglechart._numberformattype();
 //BA.debugLineNum = 129;BA.debugLine="Public Sort As String";
_sort = "";
 //BA.debugLineNum = 130;BA.debugLine="Public Version As String";
_version = "";
 //BA.debugLineNum = 131;BA.debugLine="Public RedFrom As Int";
_redfrom = 0;
 //BA.debugLineNum = 132;BA.debugLine="Public RedTo As Int";
_redto = 0;
 //BA.debugLineNum = 133;BA.debugLine="Public YellowFrom As Int";
_yellowfrom = 0;
 //BA.debugLineNum = 134;BA.debugLine="Public YellowTo As Int";
_yellowto = 0;
 //BA.debugLineNum = 135;BA.debugLine="Public MinorTicks As Int";
_minorticks = 0;
 //BA.debugLineNum = 136;BA.debugLine="Public MajorTicks As Int";
_majorticks = 0;
 //BA.debugLineNum = 137;BA.debugLine="Public greenFrom As Int";
_greenfrom = 0;
 //BA.debugLineNum = 138;BA.debugLine="Public greenTo As Int";
_greento = 0;
 //BA.debugLineNum = 139;BA.debugLine="Public MaxGauge As Int";
_maxgauge = 0;
 //BA.debugLineNum = 140;BA.debugLine="Public MinGauge As Int";
_mingauge = 0;
 //BA.debugLineNum = 141;BA.debugLine="Public BackgroundColor As String";
_backgroundcolor = "";
 //BA.debugLineNum = 142;BA.debugLine="Public FontSize As Int";
_fontsize = 0;
 //BA.debugLineNum = 143;BA.debugLine="Public FontName As String";
_fontname = "";
 //BA.debugLineNum = 144;BA.debugLine="Public IsDataView As Boolean";
_isdataview = false;
 //BA.debugLineNum = 145;BA.debugLine="Public is3D As Boolean";
_is3d = false;
 //BA.debugLineNum = 146;BA.debugLine="Public reverseCategories As Boolean";
_reversecategories = false;
 //BA.debugLineNum = 147;BA.debugLine="Public mseries As Map";
_mseries = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 148;BA.debugLine="Public enableInteractivity As Boolean";
_enableinteractivity = false;
 //BA.debugLineNum = 149;BA.debugLine="Public Animate As Boolean";
_animate = false;
 //BA.debugLineNum = 150;BA.debugLine="Public ColorAxisColors As Map";
_coloraxiscolors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 151;BA.debugLine="Public SeriesTypes As Map";
_seriestypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 152;BA.debugLine="Public DefaultSeriesType As String";
_defaultseriestype = "";
 //BA.debugLineNum = 153;BA.debugLine="Public FieldsAndTypes As Map";
_fieldsandtypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 154;BA.debugLine="Public ColumnFormats As Map";
_columnformats = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 155;BA.debugLine="Public ColumnBarFormats As Map";
_columnbarformats = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 156;BA.debugLine="Public OwnPatterns As Map";
_ownpatterns = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 157;BA.debugLine="Public ColumnNumberFormats As Map";
_columnnumberformats = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 158;BA.debugLine="Public mSeriesL As List";
_mseriesl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 159;BA.debugLine="Public SeriesColors As Map";
_seriescolors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public int  _columnposition(String _columnname) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub ColumnPosition(ColumnName As String) As Int";
 //BA.debugLineNum = 182;BA.debugLine="Return MasterSeries.IndexOf(ColumnName)";
if (true) return _masterseries.IndexOf((Object)(_columnname));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return 0;
}
public String  _doublequote(String _svalue) throws Exception{
 //BA.debugLineNum = 662;BA.debugLine="Sub DoubleQuote(sValue As String) As String";
 //BA.debugLineNum = 663;BA.debugLine="Return QUOTE & sValue & QUOTE";
if (true) return __c.QUOTE+_svalue+__c.QUOTE;
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return "";
}
public String  _drawchart(anywheresoftware.b4a.objects.WebViewWrapper _webview) throws Exception{
com.simlog.clspb _clsmpb = null;
com.simlog.clspb _clspb = null;
String _gbrl = "";
String _srl = "";
String _cbrl = "";
String _aogl = "";
int _i = 0;
String _sloc = "";
String _stype = "";
int _coltot = 0;
String _scolor = "";
String _scolorname = "";
int _si = 0;
String _sline = "";
String _fcolumnname = "";
String _fcolumnformat = "";
String _varname = "";
int _colpos = 0;
anywheresoftware.b4a.objects.collections.Map _ownf = null;
String _mp = "";
anywheresoftware.b4a.objects.collections.Map _nf = null;
String _decimalsymbol = "";
String _fractiondigits = "";
String _groupingsymbol = "";
String _negativecolor = "";
boolean _negativeparens = false;
String _pattern = "";
String _prefix = "";
String _suffix = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sx = null;
String _sbs = "";
anywheresoftware.b4a.objects.collections.Map _cf = null;
long _bfbase = 0L;
String _bfcolornegative = "";
String _bfcolorpositive = "";
boolean _bfdrawzeroline = false;
long _bfmax = 0L;
long _bfmin = 0L;
boolean _bfshowvalue = false;
int _bfwidth = 0;
 //BA.debugLineNum = 926;BA.debugLine="Sub DrawChart(WebView As WebView)";
 //BA.debugLineNum = 928;BA.debugLine="Dim clsMPB As clsPB";
_clsmpb = new com.simlog.clspb();
 //BA.debugLineNum = 929;BA.debugLine="clsMPB.Initialize";
_clsmpb._initialize /*String*/ (ba);
 //BA.debugLineNum = 930;BA.debugLine="Dim clsPB As clsPB";
_clspb = new com.simlog.clspb();
 //BA.debugLineNum = 931;BA.debugLine="clsMPB.Appendline(\"<html>\")";
_clsmpb._appendline /*String*/ ("<html>");
 //BA.debugLineNum = 932;BA.debugLine="clsMPB.appendline(\"<head>\")";
_clsmpb._appendline /*String*/ ("<head>");
 //BA.debugLineNum = 933;BA.debugLine="clsMPB.appendline(\"<!--Load the AJAX API-->\")";
_clsmpb._appendline /*String*/ ("<!--Load the AJAX API-->");
 //BA.debugLineNum = 934;BA.debugLine="clsMPB.append(\"<script \")";
_clsmpb._append /*String*/ ("<script ");
 //BA.debugLineNum = 935;BA.debugLine="clsPB.Initialize";
_clspb._initialize /*String*/ (ba);
 //BA.debugLineNum = 936;BA.debugLine="clsPB.AddProperty(\"type\", \"text/javascript\")";
_clspb._addproperty /*String*/ ("type","text/javascript");
 //BA.debugLineNum = 937;BA.debugLine="clsPB.AddProperty(\"src\", \"https://www.google.com/";
_clspb._addproperty /*String*/ ("src","https://www.google.com/jsapi");
 //BA.debugLineNum = 938;BA.debugLine="clsMPB.append(clsPB.Render)";
_clsmpb._append /*String*/ (_clspb._render /*String*/ ());
 //BA.debugLineNum = 940;BA.debugLine="clsMPB.appendline(\"></script>\")";
_clsmpb._appendline /*String*/ ("></script>");
 //BA.debugLineNum = 941;BA.debugLine="clsMPB.append(\"<script \")";
_clsmpb._append /*String*/ ("<script ");
 //BA.debugLineNum = 943;BA.debugLine="clsPB.Initialize";
_clspb._initialize /*String*/ (ba);
 //BA.debugLineNum = 944;BA.debugLine="clsPB.AddProperty(\"type\", \"text/javascript\")";
_clspb._addproperty /*String*/ ("type","text/javascript");
 //BA.debugLineNum = 945;BA.debugLine="clsMPB.append(clsPB.Render)";
_clsmpb._append /*String*/ (_clspb._render /*String*/ ());
 //BA.debugLineNum = 946;BA.debugLine="clsMPB.appendline(\">\")";
_clsmpb._appendline /*String*/ (">");
 //BA.debugLineNum = 947;BA.debugLine="clsMPB.appendline(\"// Load the Visualization API";
_clsmpb._appendline /*String*/ ("// Load the Visualization API and the relevant package.");
 //BA.debugLineNum = 950;BA.debugLine="Select Case ChartType";
switch (BA.switchObjectToInt(_charttype,_charttypeenum.Timeline /*String*/ ,_charttypeenum.Table /*String*/ ,_charttypeenum.OrgChart /*String*/ ,_charttypeenum.GeoChart /*String*/ ,_charttypeenum.Gauge /*String*/ ,_charttypeenum.MapChart /*String*/ ,_charttypeenum.Motionchart /*String*/ )) {
case 0: {
 //BA.debugLineNum = 952;BA.debugLine="clsMPB.appendline(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['timeline']});");
 break; }
case 1: {
 //BA.debugLineNum = 954;BA.debugLine="clsMPB.appendline(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['table']});");
 break; }
case 2: {
 //BA.debugLineNum = 956;BA.debugLine="clsMPB.appendline(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['orgchart']});");
 break; }
case 3: {
 //BA.debugLineNum = 958;BA.debugLine="clsMPB.appendline(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['geochart']});");
 break; }
case 4: {
 //BA.debugLineNum = 960;BA.debugLine="clsMPB.appendline(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['gauge']});");
 break; }
case 5: {
 //BA.debugLineNum = 962;BA.debugLine="clsMPB.AppendLine(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['map']});");
 break; }
case 6: {
 //BA.debugLineNum = 964;BA.debugLine="clsMPB.AppendLine(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['motionchart']});");
 break; }
default: {
 //BA.debugLineNum = 966;BA.debugLine="clsMPB.appendline(\"google.load('visualization',";
_clsmpb._appendline /*String*/ ("google.load('visualization', '"+_version+"', {'packages':['corechart']});");
 break; }
}
;
 //BA.debugLineNum = 969;BA.debugLine="clsMPB.appendline(\"// Set a callback to run when";
_clsmpb._appendline /*String*/ ("// Set a callback to run when the Google Visualization API is loaded.");
 //BA.debugLineNum = 970;BA.debugLine="clsMPB.appendline(\"google.setOnLoadCallback(drawC";
_clsmpb._appendline /*String*/ ("google.setOnLoadCallback(drawChart);");
 //BA.debugLineNum = 971;BA.debugLine="clsMPB.appendline(\"// Callback that creates AND p";
_clsmpb._appendline /*String*/ ("// Callback that creates AND populates a data table,");
 //BA.debugLineNum = 972;BA.debugLine="clsMPB.appendline(\"// instantiates the pie cha";
_clsmpb._appendline /*String*/ ("// instantiates the pie chart, passes In the data AND");
 //BA.debugLineNum = 973;BA.debugLine="clsMPB.appendline(\"// draws it.\")";
_clsmpb._appendline /*String*/ ("// draws it.");
 //BA.debugLineNum = 974;BA.debugLine="clsMPB.appendline(\"function drawChart() {\")";
_clsmpb._appendline /*String*/ ("function drawChart() {");
 //BA.debugLineNum = 975;BA.debugLine="clsMPB.appendline(\"// Create the data table.\")";
_clsmpb._appendline /*String*/ ("// Create the data table.");
 //BA.debugLineNum = 977;BA.debugLine="If XAxis.Length > 0 Then hAxisTitle = XAxis";
if (_xaxis.length()>0) { 
_haxistitle = _xaxis;};
 //BA.debugLineNum = 978;BA.debugLine="If YAxis.Length > 0 Then vAxisTitle = YAxis";
if (_yaxis.length()>0) { 
_vaxistitle = _yaxis;};
 //BA.debugLineNum = 980;BA.debugLine="If ChartType = ChartTypeEnum.OrgChart Then";
if ((_charttype).equals(_charttypeenum.OrgChart /*String*/ )) { 
 //BA.debugLineNum = 981;BA.debugLine="clsMPB.AppendLine(BuildOrgChart)";
_clsmpb._appendline /*String*/ (_buildorgchart());
 }else if((_charttype).equals(_charttypeenum.Timeline /*String*/ )) { 
 //BA.debugLineNum = 983;BA.debugLine="clsMPB.AppendLine(BuildTimeLine)";
_clsmpb._appendline /*String*/ (_buildtimeline());
 }else if((_charttype).equals(_charttypeenum.MapChart /*String*/ )) { 
 //BA.debugLineNum = 985;BA.debugLine="clsMPB.AppendLine(BuildMapArray)";
_clsmpb._appendline /*String*/ (_buildmaparray());
 }else {
 //BA.debugLineNum = 987;BA.debugLine="clsMPB.AppendLine(BuildDataTable)";
_clsmpb._appendline /*String*/ (_builddatatable());
 };
 //BA.debugLineNum = 990;BA.debugLine="clsMPB.appendline(\"// Set chart options\")";
_clsmpb._appendline /*String*/ ("// Set chart options");
 //BA.debugLineNum = 991;BA.debugLine="clsMPB.appendline(\"var options = {\")";
_clsmpb._appendline /*String*/ ("var options = {");
 //BA.debugLineNum = 992;BA.debugLine="If Title.Length > 0 Then clsMPB.appendline(\"'titl";
if (_title.length()>0) { 
_clsmpb._appendline /*String*/ ("'title':'"+_title+"',");};
 //BA.debugLineNum = 993;BA.debugLine="Select Case ChartType";
switch (BA.switchObjectToInt(_charttype,_charttypeenum.Donut /*String*/ )) {
case 0: {
 //BA.debugLineNum = 995;BA.debugLine="clsMPB.AppendLine(\"'pieHole': '0.5',\")";
_clsmpb._appendline /*String*/ ("'pieHole': '0.5',");
 //BA.debugLineNum = 996;BA.debugLine="is3D = False";
_is3d = __c.False;
 //BA.debugLineNum = 997;BA.debugLine="ChartType = ChartTypeEnum.PieChart";
_charttype = _charttypeenum.PieChart /*String*/ ;
 break; }
}
;
 //BA.debugLineNum = 1010;BA.debugLine="Select Case ChartType";
switch (BA.switchObjectToInt(_charttype,_charttypeenum.PieChart /*String*/ ,_charttypeenum.Gauge /*String*/ ,_charttypeenum.BubbleChart /*String*/ ,_charttypeenum.GeoChart /*String*/ ,_charttypeenum.Timeline /*String*/ ,_charttypeenum.Table /*String*/ ,_charttypeenum.MapChart /*String*/ ,_charttypeenum.OrgChart /*String*/ )) {
case 0: {
 //BA.debugLineNum = 1012;BA.debugLine="clsMPB.AppendLine(\"'pieSliceText': '\" & PieSlice";
_clsmpb._appendline /*String*/ ("'pieSliceText': '"+_pieslicetext+"',");
 //BA.debugLineNum = 1013;BA.debugLine="If is3D = True Then clsMPB.AppendLine(\"'is3D': '";
if (_is3d==__c.True) { 
_clsmpb._appendline /*String*/ ("'is3D': 'true',");};
 break; }
case 1: {
 //BA.debugLineNum = 1015;BA.debugLine="clsMPB.appendline(\"'redFrom':\" & RedFrom & \",\")";
_clsmpb._appendline /*String*/ ("'redFrom':"+BA.NumberToString(_redfrom)+",");
 //BA.debugLineNum = 1016;BA.debugLine="clsMPB.appendline(\"'redTo':\" & RedTo & \",\")";
_clsmpb._appendline /*String*/ ("'redTo':"+BA.NumberToString(_redto)+",");
 //BA.debugLineNum = 1017;BA.debugLine="clsMPB.appendline(\"'yellowFrom':\" & YellowFrom &";
_clsmpb._appendline /*String*/ ("'yellowFrom':"+BA.NumberToString(_yellowfrom)+",");
 //BA.debugLineNum = 1018;BA.debugLine="clsMPB.appendline(\"'yellowTo':\" & YellowTo & \",\"";
_clsmpb._appendline /*String*/ ("'yellowTo':"+BA.NumberToString(_yellowto)+",");
 //BA.debugLineNum = 1019;BA.debugLine="clsMPB.appendline(\"'greenFrom':\" & greenFrom & \"";
_clsmpb._appendline /*String*/ ("'greenFrom':"+BA.NumberToString(_greenfrom)+",");
 //BA.debugLineNum = 1020;BA.debugLine="clsMPB.appendline(\"'greenTo':\" & greenTo & \",\")";
_clsmpb._appendline /*String*/ ("'greenTo':"+BA.NumberToString(_greento)+",");
 //BA.debugLineNum = 1021;BA.debugLine="clsMPB.appendline(\"'max':\" & MaxGauge & \",\")";
_clsmpb._appendline /*String*/ ("'max':"+BA.NumberToString(_maxgauge)+",");
 //BA.debugLineNum = 1022;BA.debugLine="clsMPB.appendline(\"'min':\" & MinGauge & \",\")";
_clsmpb._appendline /*String*/ ("'min':"+BA.NumberToString(_mingauge)+",");
 //BA.debugLineNum = 1023;BA.debugLine="clsMPB.appendline(\"'minorTicks':\" & MinorTicks &";
_clsmpb._appendline /*String*/ ("'minorTicks':"+BA.NumberToString(_minorticks)+",");
 break; }
case 2: {
 //BA.debugLineNum = 1025;BA.debugLine="clsMPB.AppendLine(\"bubble: {textStyle: {fontSize";
_clsmpb._appendline /*String*/ ("bubble: {textStyle: {fontSize: "+BA.NumberToString(_bubblefontsize)+"}},");
 break; }
case 3: {
 //BA.debugLineNum = 1027;BA.debugLine="clsMPB.appendline(\"'region':'\" & Region & \"',\")";
_clsmpb._appendline /*String*/ ("'region':'"+_region+"',");
 //BA.debugLineNum = 1028;BA.debugLine="clsMPB.appendline(\"'displayMode':'\" & DisplayMod";
_clsmpb._appendline /*String*/ ("'displayMode':'"+_displaymode+"',");
 //BA.debugLineNum = 1029;BA.debugLine="If enableRegionInteractivity = True Then clsMPB.";
if (_enableregioninteractivity==__c.True) { 
_clsmpb._appendline /*String*/ ("'enableRegionInteractivity':'true',");};
 //BA.debugLineNum = 1030;BA.debugLine="If keepAspectRatio = True Then clsMPB.appendline";
if (_keepaspectratio==__c.True) { 
_clsmpb._appendline /*String*/ ("'keepAspectRatio':'true',");};
 //BA.debugLineNum = 1031;BA.debugLine="If magnifyingGlassEnable = True Then";
if (_magnifyingglassenable==__c.True) { 
 //BA.debugLineNum = 1032;BA.debugLine="clsMPB.appendline(\"'magnifyingGlass.enable':'tr";
_clsmpb._appendline /*String*/ ("'magnifyingGlass.enable':'true',");
 //BA.debugLineNum = 1033;BA.debugLine="clsMPB.appendline(\"'magnifyingGlass.zoomFactor'";
_clsmpb._appendline /*String*/ ("'magnifyingGlass.zoomFactor':'"+BA.NumberToString(_magnifyingglasszoomfactor)+"',");
 };
 //BA.debugLineNum = 1035;BA.debugLine="If Resolution.Length > 0 Then clsMPB.appendline(";
if (_resolution.length()>0) { 
_clsmpb._appendline /*String*/ ("'resolution':'"+_resolution+"',");};
 break; }
case 4: {
 //BA.debugLineNum = 1037;BA.debugLine="Dim gbrl As String: gbrl = \"false\"";
_gbrl = "";
 //BA.debugLineNum = 1037;BA.debugLine="Dim gbrl As String: gbrl = \"false\"";
_gbrl = "false";
 //BA.debugLineNum = 1038;BA.debugLine="Dim srl As String: srl = \"false\"";
_srl = "";
 //BA.debugLineNum = 1038;BA.debugLine="Dim srl As String: srl = \"false\"";
_srl = "false";
 //BA.debugLineNum = 1039;BA.debugLine="Dim cbrl As String: cbrl = \"false\"";
_cbrl = "";
 //BA.debugLineNum = 1039;BA.debugLine="Dim cbrl As String: cbrl = \"false\"";
_cbrl = "false";
 //BA.debugLineNum = 1040;BA.debugLine="Dim aogl As String: aogl = \"false\"";
_aogl = "";
 //BA.debugLineNum = 1040;BA.debugLine="Dim aogl As String: aogl = \"false\"";
_aogl = "false";
 //BA.debugLineNum = 1042;BA.debugLine="If showRowLabels = True Then srl = \"true\"";
if (_showrowlabels==__c.True) { 
_srl = "true";};
 //BA.debugLineNum = 1043;BA.debugLine="If groupByRowLabel = True Then gbrl = \"true\"";
if (_groupbyrowlabel==__c.True) { 
_gbrl = "true";};
 //BA.debugLineNum = 1044;BA.debugLine="If colorByRowLabel = True Then cbrl = \"true\"";
if (_colorbyrowlabel==__c.True) { 
_cbrl = "true";};
 //BA.debugLineNum = 1045;BA.debugLine="If avoidOverlappingGridLines = True Then aogl =";
if (_avoidoverlappinggridlines==__c.True) { 
_aogl = "true";};
 //BA.debugLineNum = 1047;BA.debugLine="clsMPB.append(\"timeline: {\")";
_clsmpb._append /*String*/ ("timeline: {");
 //BA.debugLineNum = 1048;BA.debugLine="clsMPB.Append(\"showRowLabels:'\" & srl & \"',\")";
_clsmpb._append /*String*/ ("showRowLabels:'"+_srl+"',");
 //BA.debugLineNum = 1049;BA.debugLine="clsMPB.Append(\"groupByRowLabel:'\" & gbrl & \"',\")";
_clsmpb._append /*String*/ ("groupByRowLabel:'"+_gbrl+"',");
 //BA.debugLineNum = 1050;BA.debugLine="clsMPB.Append(\"colorByRowLabel:'\" & cbrl & \"',\")";
_clsmpb._append /*String*/ ("colorByRowLabel:'"+_cbrl+"',");
 //BA.debugLineNum = 1051;BA.debugLine="clsMPB.Append(\"avoidOverlappingGridLines:'\" & ao";
_clsmpb._append /*String*/ ("avoidOverlappingGridLines:'"+_aogl+"',");
 //BA.debugLineNum = 1052;BA.debugLine="If singleColorInHex <> \"\" Then clsMPB.Append(\"si";
if ((_singlecolorinhex).equals("") == false) { 
_clsmpb._append /*String*/ ("singleColor:'"+_singlecolorinhex+"',");};
 //BA.debugLineNum = 1053;BA.debugLine="If backgroundColorInHex <> \"\" Then clsMPB.Append";
if ((_backgroundcolorinhex).equals("") == false) { 
_clsmpb._append /*String*/ ("backgroundColor:'"+_backgroundcolorinhex+"',");};
 //BA.debugLineNum = 1054;BA.debugLine="clsMPB.AppendLine(\"},\")";
_clsmpb._appendline /*String*/ ("},");
 break; }
case 5: {
 //BA.debugLineNum = 1056;BA.debugLine="If showRowNumber = True Then clsMPB.AppendLine(\"";
if (_showrownumber==__c.True) { 
_clsmpb._appendline /*String*/ ("'showRowNumber': 'true',");};
 //BA.debugLineNum = 1057;BA.debugLine="If alternatingRowStyle = True Then clsMPB.Append";
if (_alternatingrowstyle==__c.True) { 
_clsmpb._appendline /*String*/ ("'alternatingRowStyle': 'true',");};
 //BA.debugLineNum = 1058;BA.debugLine="clsMPB.AppendLine(\"'firstRowNumber': '\" & firstR";
_clsmpb._appendline /*String*/ ("'firstRowNumber': '"+BA.NumberToString(_firstrownumber)+"',");
 //BA.debugLineNum = 1059;BA.debugLine="clsMPB.AppendLine(\"'page': '\" & Page & \"',\")";
_clsmpb._appendline /*String*/ ("'page': '"+_page+"',");
 //BA.debugLineNum = 1060;BA.debugLine="clsMPB.AppendLine(\"'pageSize': '\" & pageSize & \"";
_clsmpb._appendline /*String*/ ("'pageSize': '"+BA.NumberToString(_pagesize)+"',");
 //BA.debugLineNum = 1061;BA.debugLine="If rtlTable = True Then clsMPB.AppendLine(\"'rtlT";
if (_rtltable==__c.True) { 
_clsmpb._appendline /*String*/ ("'rtlTable': 'true',");};
 //BA.debugLineNum = 1062;BA.debugLine="clsMPB.AppendLine(\"'sort': '\" & Sort & \"',\")";
_clsmpb._appendline /*String*/ ("'sort': '"+_sort+"',");
 //BA.debugLineNum = 1063;BA.debugLine="If sortAscending = False Then clsMPB.AppendLine(";
if (_sortascending==__c.False) { 
_clsmpb._appendline /*String*/ ("'sortAscending': 'false',");};
 //BA.debugLineNum = 1064;BA.debugLine="If sortColumn <> -1 Then clsMPB.AppendLine(\"'sor";
if (_sortcolumn!=-1) { 
_clsmpb._appendline /*String*/ ("'sortColumn': '"+BA.NumberToString(_sortcolumn)+"',");};
 //BA.debugLineNum = 1065;BA.debugLine="clsMPB.AppendLine(\"'startPage': '\" & startPage &";
_clsmpb._appendline /*String*/ ("'startPage': '"+BA.NumberToString(_startpage)+"',");
 break; }
case 6: {
 //BA.debugLineNum = 1067;BA.debugLine="If showTip = True Then clsMPB.AppendLine(\"'showT";
if (_showtip==__c.True) { 
_clsmpb._appendline /*String*/ ("'showTip': 'true',");};
 //BA.debugLineNum = 1068;BA.debugLine="If enableScrollWheel = True Then clsMPB.AppendLi";
if (_enablescrollwheel==__c.True) { 
_clsmpb._appendline /*String*/ ("'enableScrollWheel': 'true',");};
 //BA.debugLineNum = 1069;BA.debugLine="If showLine = True Then";
if (_showline==__c.True) { 
 //BA.debugLineNum = 1070;BA.debugLine="clsMPB.AppendLine(\"'showLine': 'true',\")";
_clsmpb._appendline /*String*/ ("'showLine': 'true',");
 //BA.debugLineNum = 1071;BA.debugLine="clsMPB.AppendLine(\"'lineWidth': '\" & lineWidth";
_clsmpb._appendline /*String*/ ("'lineWidth': '"+BA.NumberToString(_linewidth)+"',");
 //BA.debugLineNum = 1072;BA.debugLine="If lineColor.Length > 0 Then clsMPB.AppendLine(";
if (_linecolor.length()>0) { 
_clsmpb._appendline /*String*/ ("'lineColor': '"+_linecolor+"',");};
 };
 //BA.debugLineNum = 1074;BA.debugLine="If useMapTypeControl = True Then clsMPB.AppendLi";
if (_usemaptypecontrol==__c.True) { 
_clsmpb._appendline /*String*/ ("'useMapTypeControl': 'true',");};
 //BA.debugLineNum = 1075;BA.debugLine="If ZoomLevelOf = ZoomLevelEnum.automatic Then";
if ((_zoomlevelof).equals(_zoomlevelenum.Automatic /*String*/ )) { 
 //BA.debugLineNum = 1076;BA.debugLine="clsMPB.AppendLine(\"'zoomLevel': 'automatic',\")";
_clsmpb._appendline /*String*/ ("'zoomLevel': 'automatic',");
 }else {
 //BA.debugLineNum = 1078;BA.debugLine="If ZoomLevel <> -1 Then clsMPB.AppendLine(\"'zoo";
if (_zoomlevel!=-1) { 
_clsmpb._appendline /*String*/ ("'zoomLevel': '"+BA.NumberToString(_zoomlevel)+"',");};
 };
 //BA.debugLineNum = 1080;BA.debugLine="If MapType.length > 0 Then clsMPB.AppendLine(\"'m";
if (_maptype.length()>0) { 
_clsmpb._appendline /*String*/ ("'mapType': '"+_maptype+"',");};
 break; }
case 7: {
 //BA.debugLineNum = 1082;BA.debugLine="If nodeClass.Length > 0 Then clsMPB.AppendLine(\"";
if (_nodeclass.length()>0) { 
_clsmpb._appendline /*String*/ ("'nodeClass': '"+_nodeclass+"',");};
 //BA.debugLineNum = 1083;BA.debugLine="If selectedNodeClass.Length > 0 Then clsMPB.Appe";
if (_selectednodeclass.length()>0) { 
_clsmpb._appendline /*String*/ ("'selectedNodeClass': '"+_selectednodeclass+"',");};
 //BA.debugLineNum = 1084;BA.debugLine="If NodeSize.Length > 0 Then clsMPB.AppendLine(\"'";
if (_nodesize.length()>0) { 
_clsmpb._appendline /*String*/ ("'size': '"+_nodesize+"',");};
 break; }
}
;
 //BA.debugLineNum = 1087;BA.debugLine="If hAxisMaxValue <> -1 Then	clsMPB.appendline(\"'h";
if (_haxismaxvalue!=-1) { 
_clsmpb._appendline /*String*/ ("'hAxis.maxValue':"+BA.NumberToString(_haxismaxvalue)+",");};
 //BA.debugLineNum = 1088;BA.debugLine="If hAxisMinValue <> -1 Then	clsMPB.appendline(\"'h";
if (_haxisminvalue!=-1) { 
_clsmpb._appendline /*String*/ ("'hAxis.minValue':"+BA.NumberToString(_haxisminvalue)+",");};
 //BA.debugLineNum = 1089;BA.debugLine="If vAxisMaxValue <> -1 Then	clsMPB.appendline(\"'v";
if (_vaxismaxvalue!=-1) { 
_clsmpb._appendline /*String*/ ("'vAxis.maxValue':"+BA.NumberToString(_vaxismaxvalue)+",");};
 //BA.debugLineNum = 1090;BA.debugLine="If vAxisMinValue <> -1 Then	clsMPB.appendline(\"'v";
if (_vaxisminvalue!=-1) { 
_clsmpb._appendline /*String*/ ("'vAxis.minValue':"+BA.NumberToString(_vaxisminvalue)+",");};
 //BA.debugLineNum = 1092;BA.debugLine="isStacked = False";
_isstacked = __c.False;
 //BA.debugLineNum = 1093;BA.debugLine="If ChartType = ChartTypeEnum.StackedColumnChart T";
if ((_charttype).equals(_charttypeenum.StackedColumnChart /*String*/ )) { 
_isstacked = __c.True;};
 //BA.debugLineNum = 1094;BA.debugLine="If ChartType = ChartTypeEnum.StackedBarChart Then";
if ((_charttype).equals(_charttypeenum.StackedBarChart /*String*/ )) { 
_isstacked = __c.True;};
 //BA.debugLineNum = 1095;BA.debugLine="If vAxisTitle.Length > 0 Then clsMPB.AppendLine(\"";
if (_vaxistitle.length()>0) { 
_clsmpb._appendline /*String*/ ("vAxis: {title: '"+_vaxistitle+"',  titleTextStyle: {color: 'black'}},");};
 //BA.debugLineNum = 1096;BA.debugLine="If hAxisTitle.Length > 0 Then clsMPB.AppendLine(\"";
if (_haxistitle.length()>0) { 
_clsmpb._appendline /*String*/ ("hAxis: {slantedText: "+BA.ObjectToString(_haxisslantedtext)+", slantedTextAngle: "+BA.NumberToString(_haxisslantedtextangle)+", title: '"+_haxistitle+"',  titleTextStyle: {color: 'black'}},");};
 //BA.debugLineNum = 1097;BA.debugLine="If enableInteractivity = True Then clsMPB.AppendL";
if (_enableinteractivity==__c.True) { 
_clsmpb._appendline /*String*/ ("'enableInteractivity': 'true',");};
 //BA.debugLineNum = 1098;BA.debugLine="If reverseCategories = True Then clsMPB.AppendLin";
if (_reversecategories==__c.True) { 
_clsmpb._appendline /*String*/ ("'reverseCategories': 'true',");};
 //BA.debugLineNum = 1099;BA.debugLine="If isStacked = True Then clsMPB.AppendLine(\"'isSt";
if (_isstacked==__c.True) { 
_clsmpb._appendline /*String*/ ("'isStacked': 'true',");};
 //BA.debugLineNum = 1100;BA.debugLine="If axisTitlesPosition <> axisTitlesPositionEnum.a";
if ((_axistitlesposition).equals(_axistitlespositionenum.AxisOut /*String*/ ) == false) { 
_clsmpb._appendline /*String*/ ("'axisTitlesPosition': '"+_axistitlesposition+"',");};
 //BA.debugLineNum = 1101;BA.debugLine="If curveType <> curveTypeEnum.none Then clsMPB.Ap";
if ((_curvetype).equals(_curvetypeenum.None /*String*/ ) == false) { 
_clsmpb._appendline /*String*/ ("'curveType': '"+_curvetype+"',");};
 //BA.debugLineNum = 1102;BA.debugLine="If focusTarget <> focusTargetEnum.datum Then clsM";
if ((_focustarget).equals(_focustargetenum.datum /*String*/ ) == false) { 
_clsmpb._appendline /*String*/ ("'focusTarget': '"+_focustarget+"',");};
 //BA.debugLineNum = 1103;BA.debugLine="clsMPB.AppendLine(\"'legend.position': '\" & Legend";
_clsmpb._appendline /*String*/ ("'legend.position': '"+_legendposition+"',");
 //BA.debugLineNum = 1104;BA.debugLine="clsMPB.AppendLine(\"'legend.alignment': '\" & Legen";
_clsmpb._appendline /*String*/ ("'legend.alignment': '"+_legendalignment+"',");
 //BA.debugLineNum = 1105;BA.debugLine="clsMPB.AppendLine(\"'backgroundColor': '\" & Backgr";
_clsmpb._appendline /*String*/ ("'backgroundColor': '"+_backgroundcolor+"',");
 //BA.debugLineNum = 1106;BA.debugLine="clsMPB.AppendLine(\"'fontSize': '\" & FontSize & \"'";
_clsmpb._appendline /*String*/ ("'fontSize': '"+BA.NumberToString(_fontsize)+"',");
 //BA.debugLineNum = 1107;BA.debugLine="clsMPB.AppendLine(\"'fontName': '\" & FontName & \"'";
_clsmpb._appendline /*String*/ ("'fontName': '"+_fontname+"',");
 //BA.debugLineNum = 1109;BA.debugLine="If Animate = True Then";
if (_animate==__c.True) { 
 //BA.debugLineNum = 1110;BA.debugLine="clsMPB.AppendLine(\"'animation.duration': \" & Ani";
_clsmpb._appendline /*String*/ ("'animation.duration': "+BA.NumberToString(_animationduration)+",");
 //BA.debugLineNum = 1111;BA.debugLine="clsMPB.AppendLine(\"'animation.easing': '\" & Anim";
_clsmpb._appendline /*String*/ ("'animation.easing': '"+_animationeasing+"',");
 };
 //BA.debugLineNum = 1114;BA.debugLine="If DefaultSeriesType.Length > 0 Then";
if (_defaultseriestype.length()>0) { 
 //BA.debugLineNum = 1115;BA.debugLine="clsMPB.AppendLine(\"'seriesType': \" & DoubleQuote";
_clsmpb._appendline /*String*/ ("'seriesType': "+_doublequote(_defaultseriestype)+",");
 };
 //BA.debugLineNum = 1118;BA.debugLine="For i = 0 To SeriesTypes.Size - 1";
{
final int step169 = 1;
final int limit169 = (int) (_seriestypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit169 ;_i = _i + step169 ) {
 //BA.debugLineNum = 1119;BA.debugLine="Dim sLoc As String = SeriesTypes.GetKeyAt(i)";
_sloc = BA.ObjectToString(_seriestypes.GetKeyAt(_i));
 //BA.debugLineNum = 1120;BA.debugLine="Dim sType As String = SeriesTypes.GetValueAt(i)";
_stype = BA.ObjectToString(_seriestypes.GetValueAt(_i));
 //BA.debugLineNum = 1121;BA.debugLine="clsMPB.appendline(\"series: {\" & sLoc & \": {type:";
_clsmpb._appendline /*String*/ ("series: {"+_sloc+": {type: "+_doublequote(_stype)+"}},");
 }
};
 //BA.debugLineNum = 1124;BA.debugLine="If ColorAxisColors.Size > 0 Then";
if (_coloraxiscolors.getSize()>0) { 
 //BA.debugLineNum = 1125;BA.debugLine="clsMPB.AppendLine(\"colorAxis: {colors: \" & Build";
_clsmpb._appendline /*String*/ ("colorAxis: {colors: "+_buildcoloraxis()+"},");
 };
 //BA.debugLineNum = 1127;BA.debugLine="If allowHtml = True Then clsMPB.AppendLine(\"'allo";
if (_allowhtml==__c.True) { 
_clsmpb._appendline /*String*/ ("'allowHtml': 'true',");};
 //BA.debugLineNum = 1128;BA.debugLine="If allowCollapse = True Then clsMPB.AppendLine(\"'";
if (_allowcollapse==__c.True) { 
_clsmpb._appendline /*String*/ ("'allowCollapse': 'true',");};
 //BA.debugLineNum = 1130;BA.debugLine="Select Case ChartType";
switch (BA.switchObjectToInt(_charttype,_charttypeenum.PieChart /*String*/ )) {
case 0: {
 //BA.debugLineNum = 1133;BA.debugLine="Dim colTot As Int = SeriesColors.Size";
_coltot = _seriescolors.getSize();
 //BA.debugLineNum = 1134;BA.debugLine="If colTot >= 0 Then";
if (_coltot>=0) { 
 //BA.debugLineNum = 1135;BA.debugLine="clsMPB.Append(\"slices: {\")";
_clsmpb._append /*String*/ ("slices: {");
 //BA.debugLineNum = 1136;BA.debugLine="colTot = colTot - 1";
_coltot = (int) (_coltot-1);
 //BA.debugLineNum = 1137;BA.debugLine="For i = 0 To colTot";
{
final int step185 = 1;
final int limit185 = _coltot;
_i = (int) (0) ;
for (;_i <= limit185 ;_i = _i + step185 ) {
 //BA.debugLineNum = 1138;BA.debugLine="If i > 0 Then clsMPB.Append(\",\")";
if (_i>0) { 
_clsmpb._append /*String*/ (",");};
 //BA.debugLineNum = 1139;BA.debugLine="Dim sColor As String = SeriesColors.GetValueAt";
_scolor = BA.ObjectToString(_seriescolors.GetValueAt(_i));
 //BA.debugLineNum = 1140;BA.debugLine="Dim sColorName As String = SeriesC";
_scolorname = BA.ObjectToString(_seriescolors.GetKeyAt(_i));
 //BA.debugLineNum = 1141;BA.debugLine="Dim si As Int = MapKeyPosition(mseries, sColor";
_si = _mapkeyposition(_mseries,_scolorname);
 //BA.debugLineNum = 1142;BA.debugLine="If si <> -1 Then";
if (_si!=-1) { 
 //BA.debugLineNum = 1143;BA.debugLine="Dim sLine As String = si & \": {color";
_sline = BA.NumberToString(_si)+": {color: '"+_scolor+"'}";
 //BA.debugLineNum = 1144;BA.debugLine="clsMPB.Append(sLine)";
_clsmpb._append /*String*/ (_sline);
 };
 }
};
 //BA.debugLineNum = 1147;BA.debugLine="clsMPB.AppendLine(\"},\")";
_clsmpb._appendline /*String*/ ("},");
 };
 break; }
default: {
 //BA.debugLineNum = 1151;BA.debugLine="Dim colTot As Int = SeriesColors.Size";
_coltot = _seriescolors.getSize();
 //BA.debugLineNum = 1152;BA.debugLine="If colTot >= 1 Then";
if (_coltot>=1) { 
 //BA.debugLineNum = 1153;BA.debugLine="clsMPB.Append(\"series: {\")";
_clsmpb._append /*String*/ ("series: {");
 //BA.debugLineNum = 1154;BA.debugLine="colTot = colTot - 1";
_coltot = (int) (_coltot-1);
 //BA.debugLineNum = 1155;BA.debugLine="For i = 0 To colTot";
{
final int step202 = 1;
final int limit202 = _coltot;
_i = (int) (0) ;
for (;_i <= limit202 ;_i = _i + step202 ) {
 //BA.debugLineNum = 1156;BA.debugLine="If i > 0 Then clsMPB.Append(\",\")";
if (_i>0) { 
_clsmpb._append /*String*/ (",");};
 //BA.debugLineNum = 1157;BA.debugLine="Dim sColor As String = SeriesColors.GetValueAt";
_scolor = BA.ObjectToString(_seriescolors.GetValueAt(_i));
 //BA.debugLineNum = 1158;BA.debugLine="Dim sColorName As String = SeriesC";
_scolorname = BA.ObjectToString(_seriescolors.GetKeyAt(_i));
 //BA.debugLineNum = 1159;BA.debugLine="Dim si As Int = ColumnPosition(sColorName)";
_si = _columnposition(_scolorname);
 //BA.debugLineNum = 1160;BA.debugLine="If si <> -1 Then";
if (_si!=-1) { 
 //BA.debugLineNum = 1162;BA.debugLine="si = si - 1";
_si = (int) (_si-1);
 //BA.debugLineNum = 1163;BA.debugLine="Dim sLine As String = si & \": {color";
_sline = BA.NumberToString(_si)+": {color: '"+_scolor+"'}";
 //BA.debugLineNum = 1164;BA.debugLine="clsMPB.Append(sLine)";
_clsmpb._append /*String*/ (_sline);
 };
 }
};
 //BA.debugLineNum = 1167;BA.debugLine="clsMPB.AppendLine(\"},\")";
_clsmpb._appendline /*String*/ ("},");
 };
 break; }
}
;
 //BA.debugLineNum = 1172;BA.debugLine="clsMPB.AppendLine(\"};\")";
_clsmpb._appendline /*String*/ ("};");
 //BA.debugLineNum = 1175;BA.debugLine="For i = 0 To ColumnFormats.Size - 1";
{
final int step217 = 1;
final int limit217 = (int) (_columnformats.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit217 ;_i = _i + step217 ) {
 //BA.debugLineNum = 1176;BA.debugLine="Dim fColumnName As String: fColumnName = ColumnF";
_fcolumnname = "";
 //BA.debugLineNum = 1176;BA.debugLine="Dim fColumnName As String: fColumnName = ColumnF";
_fcolumnname = BA.ObjectToString(_columnformats.GetKeyAt(_i));
 //BA.debugLineNum = 1177;BA.debugLine="Dim fColumnFormat As String: fColumnFormat = Col";
_fcolumnformat = "";
 //BA.debugLineNum = 1177;BA.debugLine="Dim fColumnFormat As String: fColumnFormat = Col";
_fcolumnformat = BA.ObjectToString(_columnformats.GetValueAt(_i));
 //BA.debugLineNum = 1178;BA.debugLine="Dim varName As String: varName = \"var\" & fColumn";
_varname = "";
 //BA.debugLineNum = 1178;BA.debugLine="Dim varName As String: varName = \"var\" & fColumn";
_varname = "var"+_fcolumnname.replace(" ","").replace("_","").replace("(","").replace(")","");
 //BA.debugLineNum = 1179;BA.debugLine="Dim colPos As Int: colPos = ColumnPosition(fColu";
_colpos = 0;
 //BA.debugLineNum = 1179;BA.debugLine="Dim colPos As Int: colPos = ColumnPosition(fColu";
_colpos = _columnposition(_fcolumnname);
 //BA.debugLineNum = 1180;BA.debugLine="clsMPB.AppendLine(\"// Create a formatter for the";
_clsmpb._appendline /*String*/ ("// Create a formatter for the "+_fcolumnname+" column.");
 //BA.debugLineNum = 1181;BA.debugLine="clsMPB.AppendLine(\"// This example uses Object l";
_clsmpb._appendline /*String*/ ("// This example uses Object literal notation To define the options.");
 //BA.debugLineNum = 1182;BA.debugLine="Select Case fColumnFormat";
switch (BA.switchObjectToInt(_fcolumnformat,_columnformatenum.MediumDate /*String*/ ,_columnformatenum.ShortDate /*String*/ ,_columnformatenum.LongDate /*String*/ ,_columnformatenum.ArrowFormat /*String*/ ,_columnformatenum.PatternFormat /*String*/ ,_columnformatenum.OwnDatePattern /*String*/ ,_columnformatenum.NumberFmt /*String*/ ,_columnformatenum.BarFormat /*String*/ )) {
case 0: {
 //BA.debugLineNum = 1184;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new go";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.DateFormat({formatType: 'medium'});");
 //BA.debugLineNum = 1185;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName)";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1186;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 break; }
case 1: {
 //BA.debugLineNum = 1188;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new go";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.DateFormat({formatType: 'short'});");
 //BA.debugLineNum = 1189;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName)";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1190;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 break; }
case 2: {
 //BA.debugLineNum = 1192;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new go";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.DateFormat({formatType: 'long'});");
 //BA.debugLineNum = 1193;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName)";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1194;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 break; }
case 3: {
 //BA.debugLineNum = 1196;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new go";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.ArrowFormat();");
 //BA.debugLineNum = 1197;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName)";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1198;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 break; }
case 4: {
 //BA.debugLineNum = 1200;BA.debugLine="If OwnPatterns.ContainsKey(fColumnName) Then";
if (_ownpatterns.ContainsKey((Object)(_fcolumnname))) { 
 //BA.debugLineNum = 1201;BA.debugLine="Dim ownF As Map";
_ownf = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1202;BA.debugLine="ownF.Initialize";
_ownf.Initialize();
 //BA.debugLineNum = 1203;BA.debugLine="ownF = OwnPatterns.Get(fColumnName)";
_ownf = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_ownpatterns.Get((Object)(_fcolumnname))));
 //BA.debugLineNum = 1204;BA.debugLine="Dim mp As String: mp = ownF.Get(\"pattern\")";
_mp = "";
 //BA.debugLineNum = 1204;BA.debugLine="Dim mp As String: mp = ownF.Get(\"pattern\")";
_mp = BA.ObjectToString(_ownf.Get((Object)("pattern")));
 //BA.debugLineNum = 1205;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new g";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.PatternFormat("+_mp+");");
 //BA.debugLineNum = 1206;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1207;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 };
 break; }
case 5: {
 //BA.debugLineNum = 1210;BA.debugLine="If OwnPatterns.ContainsKey(fColumnName) Then";
if (_ownpatterns.ContainsKey((Object)(_fcolumnname))) { 
 //BA.debugLineNum = 1211;BA.debugLine="Dim ownF As Map";
_ownf = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1212;BA.debugLine="ownF.Initialize";
_ownf.Initialize();
 //BA.debugLineNum = 1213;BA.debugLine="ownF = OwnPatterns.Get(fColumnName)";
_ownf = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_ownpatterns.Get((Object)(_fcolumnname))));
 //BA.debugLineNum = 1214;BA.debugLine="Dim mp As String: mp = ownF.Get(\"pattern\")";
_mp = "";
 //BA.debugLineNum = 1214;BA.debugLine="Dim mp As String: mp = ownF.Get(\"pattern\")";
_mp = BA.ObjectToString(_ownf.Get((Object)("pattern")));
 //BA.debugLineNum = 1215;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new g";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.DateFormat({pattern: "+_doublequote(_mp)+"});");
 //BA.debugLineNum = 1216;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1217;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 };
 break; }
case 6: {
 //BA.debugLineNum = 1220;BA.debugLine="If ColumnNumberFormats.ContainsKey(fColumnName)";
if (_columnnumberformats.ContainsKey((Object)(_fcolumnname))) { 
 //BA.debugLineNum = 1221;BA.debugLine="Dim nf As Map";
_nf = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1222;BA.debugLine="nf.Initialize";
_nf.Initialize();
 //BA.debugLineNum = 1223;BA.debugLine="nf = ColumnNumberFormats.Get(fColumnName)";
_nf = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnnumberformats.Get((Object)(_fcolumnname))));
 //BA.debugLineNum = 1225;BA.debugLine="Dim decimalSymbol As String: decimalSymbol = n";
_decimalsymbol = "";
 //BA.debugLineNum = 1225;BA.debugLine="Dim decimalSymbol As String: decimalSymbol = n";
_decimalsymbol = BA.ObjectToString(_nf.Get((Object)("decimalSymbol")));
 //BA.debugLineNum = 1226;BA.debugLine="Dim fractionDigits As String: fractionDigits =";
_fractiondigits = "";
 //BA.debugLineNum = 1226;BA.debugLine="Dim fractionDigits As String: fractionDigits =";
_fractiondigits = BA.ObjectToString(_nf.Get((Object)("fractionDigits")));
 //BA.debugLineNum = 1227;BA.debugLine="Dim groupingSymbol As String: groupingSymbol =";
_groupingsymbol = "";
 //BA.debugLineNum = 1227;BA.debugLine="Dim groupingSymbol As String: groupingSymbol =";
_groupingsymbol = BA.ObjectToString(_nf.Get((Object)("groupingSymbol")));
 //BA.debugLineNum = 1228;BA.debugLine="Dim negativeColor As String: negativeColor = n";
_negativecolor = "";
 //BA.debugLineNum = 1228;BA.debugLine="Dim negativeColor As String: negativeColor = n";
_negativecolor = BA.ObjectToString(_nf.Get((Object)("negativeColor")));
 //BA.debugLineNum = 1229;BA.debugLine="Dim negativeParens As Boolean: negativeParens";
_negativeparens = false;
 //BA.debugLineNum = 1229;BA.debugLine="Dim negativeParens As Boolean: negativeParens";
_negativeparens = BA.ObjectToBoolean(_nf.Get((Object)("negativeParens")));
 //BA.debugLineNum = 1230;BA.debugLine="Dim pattern As String: pattern = nf.get(\"patte";
_pattern = "";
 //BA.debugLineNum = 1230;BA.debugLine="Dim pattern As String: pattern = nf.get(\"patte";
_pattern = BA.ObjectToString(_nf.Get((Object)("pattern")));
 //BA.debugLineNum = 1231;BA.debugLine="Dim prefix As String: prefix = nf.get(\"prefix\"";
_prefix = "";
 //BA.debugLineNum = 1231;BA.debugLine="Dim prefix As String: prefix = nf.get(\"prefix\"";
_prefix = BA.ObjectToString(_nf.Get((Object)("prefix")));
 //BA.debugLineNum = 1232;BA.debugLine="Dim suffix As String: suffix = nf.get(\"suffix\"";
_suffix = "";
 //BA.debugLineNum = 1232;BA.debugLine="Dim suffix As String: suffix = nf.get(\"suffix\"";
_suffix = BA.ObjectToString(_nf.Get((Object)("suffix")));
 //BA.debugLineNum = 1234;BA.debugLine="Dim sx As StringBuilder";
_sx = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1235;BA.debugLine="sx.Initialize";
_sx.Initialize();
 //BA.debugLineNum = 1236;BA.debugLine="If decimalSymbol <> \".\" Then sx.Append(\"decima";
if ((_decimalsymbol).equals(".") == false) { 
_sx.Append("decimalSymbol:'"+_decimalsymbol).Append("',");};
 //BA.debugLineNum = 1237;BA.debugLine="If fractionDigits <> \"2\" Then sx.Append(\"fract";
if ((_fractiondigits).equals("2") == false) { 
_sx.Append("fractionDigits:'"+_fractiondigits).Append("',");};
 //BA.debugLineNum = 1238;BA.debugLine="If groupingSymbol <> \",\" Then sx.Append(\"group";
if ((_groupingsymbol).equals(",") == false) { 
_sx.Append("groupingSymbol:'"+_groupingsymbol).Append("',");};
 //BA.debugLineNum = 1239;BA.debugLine="sx.Append(\"negativeColor:'\" & negativeColor).A";
_sx.Append("negativeColor:'"+_negativecolor).Append("',");
 //BA.debugLineNum = 1240;BA.debugLine="If negativeParens = True Then sx.Append(\"negat";
if (_negativeparens==__c.True) { 
_sx.Append("negativeParens:'true").Append("',");};
 //BA.debugLineNum = 1241;BA.debugLine="If pattern <> \"\" Then sx.Append(\"pattern:'\" &";
if ((_pattern).equals("") == false) { 
_sx.Append("pattern:'"+_pattern).Append("',");};
 //BA.debugLineNum = 1242;BA.debugLine="sx.Append(\"prefix:'\" & prefix).Append(\"',\")";
_sx.Append("prefix:'"+_prefix).Append("',");
 //BA.debugLineNum = 1243;BA.debugLine="sx.Append(\"suffix:'\" & suffix).Append(\"',\")";
_sx.Append("suffix:'"+_suffix).Append("',");
 //BA.debugLineNum = 1244;BA.debugLine="Dim sbs As String: sbs = sx.ToString";
_sbs = "";
 //BA.debugLineNum = 1244;BA.debugLine="Dim sbs As String: sbs = sx.ToString";
_sbs = _sx.ToString();
 //BA.debugLineNum = 1245;BA.debugLine="sbs = MvRemoveBlanks(sbs, \",\")";
_sbs = _mvremoveblanks(_sbs,",");
 //BA.debugLineNum = 1246;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new g";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.NumberFormat({"+_sbs+"});");
 }else {
 //BA.debugLineNum = 1248;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new g";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.NumberFormat();");
 };
 //BA.debugLineNum = 1250;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName)";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1251;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 break; }
case 7: {
 //BA.debugLineNum = 1253;BA.debugLine="If ColumnBarFormats.ContainsKey(fColumnName) Th";
if (_columnbarformats.ContainsKey((Object)(_fcolumnname))) { 
 //BA.debugLineNum = 1254;BA.debugLine="Dim cf As Map";
_cf = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1255;BA.debugLine="cf.Initialize";
_cf.Initialize();
 //BA.debugLineNum = 1256;BA.debugLine="cf = ColumnBarFormats.Get(fColumnName)";
_cf = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnbarformats.Get((Object)(_fcolumnname))));
 //BA.debugLineNum = 1257;BA.debugLine="Dim bfBase As Long : bfBase = cf.Get(\"base\")";
_bfbase = 0L;
 //BA.debugLineNum = 1257;BA.debugLine="Dim bfBase As Long : bfBase = cf.Get(\"base\")";
_bfbase = BA.ObjectToLongNumber(_cf.Get((Object)("base")));
 //BA.debugLineNum = 1258;BA.debugLine="Dim bfColorNegative As String: bfColorNegative";
_bfcolornegative = "";
 //BA.debugLineNum = 1258;BA.debugLine="Dim bfColorNegative As String: bfColorNegative";
_bfcolornegative = BA.ObjectToString(_cf.Get((Object)("colornegative")));
 //BA.debugLineNum = 1259;BA.debugLine="Dim bfColorPositive As String: bfColorPositive";
_bfcolorpositive = "";
 //BA.debugLineNum = 1259;BA.debugLine="Dim bfColorPositive As String: bfColorPositive";
_bfcolorpositive = BA.ObjectToString(_cf.Get((Object)("colorpositive")));
 //BA.debugLineNum = 1260;BA.debugLine="Dim bfDrawZeroLine As Boolean: bfDrawZeroLine";
_bfdrawzeroline = false;
 //BA.debugLineNum = 1260;BA.debugLine="Dim bfDrawZeroLine As Boolean: bfDrawZeroLine";
_bfdrawzeroline = BA.ObjectToBoolean(_cf.Get((Object)("drawzeroline")));
 //BA.debugLineNum = 1261;BA.debugLine="Dim bfMax As Long: bfMax = cf.get(\"max\")";
_bfmax = 0L;
 //BA.debugLineNum = 1261;BA.debugLine="Dim bfMax As Long: bfMax = cf.get(\"max\")";
_bfmax = BA.ObjectToLongNumber(_cf.Get((Object)("max")));
 //BA.debugLineNum = 1262;BA.debugLine="Dim bfMin As Long: bfMin = cf.Get(\"min\")";
_bfmin = 0L;
 //BA.debugLineNum = 1262;BA.debugLine="Dim bfMin As Long: bfMin = cf.Get(\"min\")";
_bfmin = BA.ObjectToLongNumber(_cf.Get((Object)("min")));
 //BA.debugLineNum = 1263;BA.debugLine="Dim bfShowValue As Boolean: bfShowValue = cf.g";
_bfshowvalue = false;
 //BA.debugLineNum = 1263;BA.debugLine="Dim bfShowValue As Boolean: bfShowValue = cf.g";
_bfshowvalue = BA.ObjectToBoolean(_cf.Get((Object)("showvalue")));
 //BA.debugLineNum = 1264;BA.debugLine="Dim bfWidth As Int: bfWidth = cf.get(\"width\")";
_bfwidth = 0;
 //BA.debugLineNum = 1264;BA.debugLine="Dim bfWidth As Int: bfWidth = cf.get(\"width\")";
_bfwidth = (int)(BA.ObjectToNumber(_cf.Get((Object)("width"))));
 //BA.debugLineNum = 1265;BA.debugLine="Dim sx As StringBuilder";
_sx = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1266;BA.debugLine="sx.Initialize";
_sx.Initialize();
 //BA.debugLineNum = 1267;BA.debugLine="If bfBase <> 0 Then sx.Append(\"base:'\" & bfBas";
if (_bfbase!=0) { 
_sx.Append("base:'"+BA.NumberToString(_bfbase)).Append("',");};
 //BA.debugLineNum = 1268;BA.debugLine="If bfColorNegative <> \"red\" Then sx.Append(\"co";
if ((_bfcolornegative).equals("red") == false) { 
_sx.Append("colorNegative:'"+_bfcolornegative).Append("',");};
 //BA.debugLineNum = 1269;BA.debugLine="If bfColorPositive <> \"blue\" Then sx.Append(\"c";
if ((_bfcolorpositive).equals("blue") == false) { 
_sx.Append("colorPositive:'"+_bfcolorpositive).Append("',");};
 //BA.debugLineNum = 1270;BA.debugLine="If bfDrawZeroLine <> False Then sx.Append(\"dra";
if (_bfdrawzeroline!=__c.False) { 
_sx.Append("drawZeroLine:'true'").Append(",");};
 //BA.debugLineNum = 1271;BA.debugLine="If bfMax <> -1 Then sx.Append(\"max:'\" & bfMax)";
if (_bfmax!=-1) { 
_sx.Append("max:'"+BA.NumberToString(_bfmax)).Append("',");};
 //BA.debugLineNum = 1272;BA.debugLine="If bfMin <> -1 Then sx.Append(\"min:'\" & bfMin)";
if (_bfmin!=-1) { 
_sx.Append("min:'"+BA.NumberToString(_bfmin)).Append("',");};
 //BA.debugLineNum = 1273;BA.debugLine="If bfShowValue = False Then sx.Append(\"showVal";
if (_bfshowvalue==__c.False) { 
_sx.Append("showValue:'false'").Append(",");};
 //BA.debugLineNum = 1274;BA.debugLine="If bfWidth <> 100 Then sx.Append(\"bfWidth:'\" &";
if (_bfwidth!=100) { 
_sx.Append("bfWidth:'"+BA.NumberToString(_bfwidth)+"'");};
 //BA.debugLineNum = 1275;BA.debugLine="Dim sbs As String: sbs = sx.ToString";
_sbs = "";
 //BA.debugLineNum = 1275;BA.debugLine="Dim sbs As String: sbs = sx.ToString";
_sbs = _sx.ToString();
 //BA.debugLineNum = 1276;BA.debugLine="sbs = MvRemoveBlanks(sbs, \",\")";
_sbs = _mvremoveblanks(_sbs,",");
 //BA.debugLineNum = 1277;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new g";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.BarFormat({"+_sbs+"});");
 }else {
 //BA.debugLineNum = 1279;BA.debugLine="clsMPB.AppendLine(\"var \" & varName & \" = new g";
_clsmpb._appendline /*String*/ ("var "+_varname+" = new google.visualization.BarFormat();");
 };
 //BA.debugLineNum = 1281;BA.debugLine="clsMPB.AppendLine(\"// Reformat \" & fColumnName)";
_clsmpb._appendline /*String*/ ("// Reformat "+_fcolumnname);
 //BA.debugLineNum = 1282;BA.debugLine="clsMPB.AppendLine(varName & \".format(data, \" &";
_clsmpb._appendline /*String*/ (_varname+".format(data, "+BA.NumberToString(_colpos)+");");
 break; }
}
;
 }
};
 //BA.debugLineNum = 1286;BA.debugLine="clsMPB.appendline(\"// Instantiate and draw our ch";
_clsmpb._appendline /*String*/ ("// Instantiate and draw our chart, passing in some options.");
 //BA.debugLineNum = 1287;BA.debugLine="clsMPB.appendline(\"var chart = new google.visuali";
_clsmpb._appendline /*String*/ ("var chart = new google.visualization."+_charttype.replace("Stacked","").replace("Markers","").replace("MapChart","Map")+"(document.getElementById('chart_div'));");
 //BA.debugLineNum = 1288;BA.debugLine="If IsDataView = True Then";
if (_isdataview==__c.True) { 
 //BA.debugLineNum = 1289;BA.debugLine="clsMPB.AppendLine(\"var view = new google.visuali";
_clsmpb._appendline /*String*/ ("var view = new google.visualization.DataView(data);");
 //BA.debugLineNum = 1291;BA.debugLine="clsMPB.appendline(\"chart.draw(view, options);\")";
_clsmpb._appendline /*String*/ ("chart.draw(view, options);");
 }else {
 //BA.debugLineNum = 1293;BA.debugLine="clsMPB.appendline(\"chart.draw(data, options);\")";
_clsmpb._appendline /*String*/ ("chart.draw(data, options);");
 };
 //BA.debugLineNum = 1295;BA.debugLine="clsMPB.appendline(\"}\")";
_clsmpb._appendline /*String*/ ("}");
 //BA.debugLineNum = 1298;BA.debugLine="clsMPB.appendline(\"</script>\")";
_clsmpb._appendline /*String*/ ("</script>");
 //BA.debugLineNum = 1299;BA.debugLine="clsMPB.appendline(\"</head>\")";
_clsmpb._appendline /*String*/ ("</head>");
 //BA.debugLineNum = 1300;BA.debugLine="clsMPB.appendline(\"<body>\")";
_clsmpb._appendline /*String*/ ("<body>");
 //BA.debugLineNum = 1301;BA.debugLine="clsMPB.appendline(\"<!--Div that will hold the pie";
_clsmpb._appendline /*String*/ ("<!--Div that will hold the pie chart-->");
 //BA.debugLineNum = 1302;BA.debugLine="clsMPB.append(\"<div \")";
_clsmpb._append /*String*/ ("<div ");
 //BA.debugLineNum = 1304;BA.debugLine="clsPB.Initialize";
_clspb._initialize /*String*/ (ba);
 //BA.debugLineNum = 1305;BA.debugLine="clsPB.AddProperty(\"id\", \"chart_div\")";
_clspb._addproperty /*String*/ ("id","chart_div");
 //BA.debugLineNum = 1306;BA.debugLine="clsPB.AddProperty(\"style\",\"width:\" & Width & \"; h";
_clspb._addproperty /*String*/ ("style","width:"+_width+"; height:"+_height);
 //BA.debugLineNum = 1307;BA.debugLine="clsMPB.append(clsPB.Render)";
_clsmpb._append /*String*/ (_clspb._render /*String*/ ());
 //BA.debugLineNum = 1308;BA.debugLine="clsMPB.append(\"></div>\")";
_clsmpb._append /*String*/ ("></div>");
 //BA.debugLineNum = 1309;BA.debugLine="clsMPB.appendline(\"</body>\")";
_clsmpb._appendline /*String*/ ("</body>");
 //BA.debugLineNum = 1310;BA.debugLine="clsMPB.appendline(\"</HTML>\")";
_clsmpb._appendline /*String*/ ("</HTML>");
 //BA.debugLineNum = 1311;BA.debugLine="HTML = clsMPB.renderlines";
_html = _clsmpb._renderlines /*String*/ ();
 //BA.debugLineNum = 1312;BA.debugLine="If SaveToo = True Then File.WriteString(File.DirD";
if (_savetoo==__c.True) { 
__c.File.WriteString(__c.File.getDirDefaultExternal(),_title.replace(":","_").replace("?","_").replace(">","_").replace("<","_").replace("/","_").replace("\\","_").replace("|","_")+".html",_html);};
 //BA.debugLineNum = 1313;BA.debugLine="Log(HTML)";
__c.LogImpl("57340419",_html,0);
 //BA.debugLineNum = 1314;BA.debugLine="WebView.LoadHtml(HTML)";
_webview.LoadHtml(_html);
 //BA.debugLineNum = 1315;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 431;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 432;BA.debugLine="AnimationEasingEnum.Initialize";
_animationeasingenum.Initialize();
 //BA.debugLineNum = 433;BA.debugLine="SeriesTypeEnum.Initialize";
_seriestypeenum.Initialize();
 //BA.debugLineNum = 434;BA.debugLine="PieSliceTextEnum.Initialize";
_pieslicetextenum.Initialize();
 //BA.debugLineNum = 435;BA.debugLine="LegendAlignmentEnum.Initialize";
_legendalignmentenum.Initialize();
 //BA.debugLineNum = 436;BA.debugLine="LegendPositionEnum.Initialize";
_legendpositionenum.Initialize();
 //BA.debugLineNum = 437;BA.debugLine="ChartTypeEnum.Initialize";
_charttypeenum.Initialize();
 //BA.debugLineNum = 438;BA.debugLine="DisplayModeTypeEnum.Initialize";
_displaymodetypeenum.Initialize();
 //BA.debugLineNum = 439;BA.debugLine="ResolutionTypeEnum.Initialize";
_resolutiontypeenum.Initialize();
 //BA.debugLineNum = 440;BA.debugLine="NodeSizeEnum.Initialize";
_nodesizeenum.Initialize();
 //BA.debugLineNum = 441;BA.debugLine="ColumnFormatEnum.Initialize";
_columnformatenum.Initialize();
 //BA.debugLineNum = 442;BA.debugLine="PageEnum.Initialize";
_pageenum.Initialize();
 //BA.debugLineNum = 443;BA.debugLine="SortEnum.Initialize";
_sortenum.Initialize();
 //BA.debugLineNum = 444;BA.debugLine="SortEnum.Disable = \"disable\"";
_sortenum.Disable /*String*/  = "disable";
 //BA.debugLineNum = 445;BA.debugLine="SortEnum.Enable = \"enable\"";
_sortenum.Enable /*String*/  = "enable";
 //BA.debugLineNum = 446;BA.debugLine="SortEnum.Event = \"event\"";
_sortenum.Event /*String*/  = "event";
 //BA.debugLineNum = 447;BA.debugLine="BarFormatOption.Initialize";
_barformatoption.Initialize();
 //BA.debugLineNum = 448;BA.debugLine="NumberFormatOption.Initialize";
_numberformatoption.Initialize();
 //BA.debugLineNum = 450;BA.debugLine="X.Initialize";
_x.Initialize();
 //BA.debugLineNum = 451;BA.debugLine="Y.Initialize";
_y.Initialize();
 //BA.debugLineNum = 452;BA.debugLine="focusTargetEnum.Initialize";
_focustargetenum.Initialize();
 //BA.debugLineNum = 453;BA.debugLine="focusTargetEnum.datum = \"datum\"";
_focustargetenum.datum /*String*/  = "datum";
 //BA.debugLineNum = 454;BA.debugLine="focusTargetEnum.category = \"category\"";
_focustargetenum.category /*String*/  = "category";
 //BA.debugLineNum = 455;BA.debugLine="focusTarget = focusTargetEnum.datum";
_focustarget = _focustargetenum.datum /*String*/ ;
 //BA.debugLineNum = 456;BA.debugLine="curveTypeEnum.Initialize";
_curvetypeenum.Initialize();
 //BA.debugLineNum = 457;BA.debugLine="curveTypeEnum.Function = \"function\"";
_curvetypeenum.Function /*String*/  = "function";
 //BA.debugLineNum = 458;BA.debugLine="curveTypeEnum.None = \"none\"";
_curvetypeenum.None /*String*/  = "none";
 //BA.debugLineNum = 459;BA.debugLine="curveType = curveTypeEnum.None";
_curvetype = _curvetypeenum.None /*String*/ ;
 //BA.debugLineNum = 460;BA.debugLine="axisTitlesPositionEnum.Initialize";
_axistitlespositionenum.Initialize();
 //BA.debugLineNum = 461;BA.debugLine="axisTitlesPositionEnum.AxisIn = \"in\"";
_axistitlespositionenum.AxisIn /*String*/  = "in";
 //BA.debugLineNum = 462;BA.debugLine="axisTitlesPositionEnum.AxisNone = \"none\"";
_axistitlespositionenum.AxisNone /*String*/  = "none";
 //BA.debugLineNum = 463;BA.debugLine="axisTitlesPositionEnum.AxisOut = \"out\"";
_axistitlespositionenum.AxisOut /*String*/  = "out";
 //BA.debugLineNum = 464;BA.debugLine="axisTitlesPosition = axisTitlesPositionEnum.AxisO";
_axistitlesposition = _axistitlespositionenum.AxisOut /*String*/ ;
 //BA.debugLineNum = 465;BA.debugLine="hAxisslantedTextAngle = 45";
_haxisslantedtextangle = (int) (45);
 //BA.debugLineNum = 466;BA.debugLine="hAxisslantedText = False";
_haxisslantedtext = __c.False;
 //BA.debugLineNum = 467;BA.debugLine="ZoomLevelEnum.Initialize";
_zoomlevelenum.Initialize();
 //BA.debugLineNum = 468;BA.debugLine="ZoomLevelEnum.Automatic = \"automatic\"";
_zoomlevelenum.Automatic /*String*/  = "automatic";
 //BA.debugLineNum = 469;BA.debugLine="ZoomLevelEnum.Number = \"number\"";
_zoomlevelenum.Number /*String*/  = "number";
 //BA.debugLineNum = 470;BA.debugLine="ZoomLevelOf = ZoomLevelEnum.Automatic";
_zoomlevelof = _zoomlevelenum.Automatic /*String*/ ;
 //BA.debugLineNum = 471;BA.debugLine="MapTypeEnum.Initialize";
_maptypeenum.Initialize();
 //BA.debugLineNum = 472;BA.debugLine="MapTypeEnum.Hybrid = \"hybrid\"";
_maptypeenum.Hybrid /*String*/  = "hybrid";
 //BA.debugLineNum = 473;BA.debugLine="MapTypeEnum.Normal = \"normal\"";
_maptypeenum.Normal /*String*/  = "normal";
 //BA.debugLineNum = 474;BA.debugLine="MapTypeEnum.Satellite = \"satellite\"";
_maptypeenum.Satellite /*String*/  = "satellite";
 //BA.debugLineNum = 475;BA.debugLine="MapTypeEnum.Terrain = \"terrain\"";
_maptypeenum.Terrain /*String*/  = "terrain";
 //BA.debugLineNum = 476;BA.debugLine="MapType = MapTypeEnum.Hybrid";
_maptype = _maptypeenum.Hybrid /*String*/ ;
 //BA.debugLineNum = 477;BA.debugLine="ZoomLevel = 0";
_zoomlevel = (int) (0);
 //BA.debugLineNum = 478;BA.debugLine="useMapTypeControl = False";
_usemaptypecontrol = __c.False;
 //BA.debugLineNum = 479;BA.debugLine="lineColor = \"\"";
_linecolor = "";
 //BA.debugLineNum = 480;BA.debugLine="lineWidth = 10";
_linewidth = (int) (10);
 //BA.debugLineNum = 481;BA.debugLine="showLine = False";
_showline = __c.False;
 //BA.debugLineNum = 482;BA.debugLine="showTip = False";
_showtip = __c.False;
 //BA.debugLineNum = 483;BA.debugLine="enableScrollWheel = False";
_enablescrollwheel = __c.False;
 //BA.debugLineNum = 484;BA.debugLine="AnimationDuration = 1000";
_animationduration = (int) (1000);
 //BA.debugLineNum = 485;BA.debugLine="SeriesColors.Initialize";
_seriescolors.Initialize();
 //BA.debugLineNum = 486;BA.debugLine="ColumnFormats.Initialize";
_columnformats.Initialize();
 //BA.debugLineNum = 487;BA.debugLine="FieldsAndTypes.Initialize";
_fieldsandtypes.Initialize();
 //BA.debugLineNum = 488;BA.debugLine="DefaultSeriesType = \"\"";
_defaultseriestype = "";
 //BA.debugLineNum = 489;BA.debugLine="mseries.Initialize";
_mseries.Initialize();
 //BA.debugLineNum = 490;BA.debugLine="SeriesTypes.Initialize";
_seriestypes.Initialize();
 //BA.debugLineNum = 491;BA.debugLine="ColumnNumberFormats.Initialize";
_columnnumberformats.Initialize();
 //BA.debugLineNum = 492;BA.debugLine="enableInteractivity = True";
_enableinteractivity = __c.True;
 //BA.debugLineNum = 493;BA.debugLine="showRowNumber = False";
_showrownumber = __c.False;
 //BA.debugLineNum = 494;BA.debugLine="keepAspectRatio = False";
_keepaspectratio = __c.False;
 //BA.debugLineNum = 495;BA.debugLine="MasterSeries.Initialize";
_masterseries.Initialize();
 //BA.debugLineNum = 496;BA.debugLine="ColorAxisColors.Initialize";
_coloraxiscolors.Initialize();
 //BA.debugLineNum = 497;BA.debugLine="singleColorInHex = \"\"";
_singlecolorinhex = "";
 //BA.debugLineNum = 498;BA.debugLine="backgroundColorInHex = \"\"";
_backgroundcolorinhex = "";
 //BA.debugLineNum = 499;BA.debugLine="magnifyingGlassEnable = False";
_magnifyingglassenable = __c.False;
 //BA.debugLineNum = 500;BA.debugLine="colorByRowLabel = False";
_colorbyrowlabel = __c.False;
 //BA.debugLineNum = 501;BA.debugLine="OwnPatterns.Initialize";
_ownpatterns.Initialize();
 //BA.debugLineNum = 502;BA.debugLine="magnifyingGlassZoomFactor = 5.0";
_magnifyingglasszoomfactor = 5.0;
 //BA.debugLineNum = 503;BA.debugLine="groupByRowLabel = False";
_groupbyrowlabel = __c.False;
 //BA.debugLineNum = 504;BA.debugLine="DT_String = \"string\"";
_dt_string = "string";
 //BA.debugLineNum = 505;BA.debugLine="DT_Number = \"number\"";
_dt_number = "number";
 //BA.debugLineNum = 506;BA.debugLine="DT_Date = \"date\"";
_dt_date = "date";
 //BA.debugLineNum = 507;BA.debugLine="DT_DateTime = \"datetime\"";
_dt_datetime = "datetime";
 //BA.debugLineNum = 508;BA.debugLine="DT_TimeOfDay = \"timeofday\"";
_dt_timeofday = "timeofday";
 //BA.debugLineNum = 509;BA.debugLine="DataTypeEnum.Initialize";
_datatypeenum.Initialize();
 //BA.debugLineNum = 510;BA.debugLine="DataTypeEnum.DT_Boolean = \"boolean\"";
_datatypeenum.DT_Boolean /*String*/  = "boolean";
 //BA.debugLineNum = 511;BA.debugLine="DataTypeEnum.DT_Date = \"date\"";
_datatypeenum.DT_Date /*String*/  = "date";
 //BA.debugLineNum = 512;BA.debugLine="DataTypeEnum.DT_Number = \"number\"";
_datatypeenum.DT_Number /*String*/  = "number";
 //BA.debugLineNum = 513;BA.debugLine="DataTypeEnum.DT_String = \"string\"";
_datatypeenum.DT_String /*String*/  = "string";
 //BA.debugLineNum = 514;BA.debugLine="DataTypeEnum.DT_TimeOfDay = \"timeofday\"";
_datatypeenum.DT_TimeOfDay /*String*/  = "timeofday";
 //BA.debugLineNum = 515;BA.debugLine="DataTypeEnum.DT_DateTime = \"datetime\"";
_datatypeenum.DT_DateTime /*String*/  = "datetime";
 //BA.debugLineNum = 516;BA.debugLine="DataTypeEnum.DT_Time = \"time\"";
_datatypeenum.DT_Time /*String*/  = "time";
 //BA.debugLineNum = 517;BA.debugLine="Version = \"1\"";
_version = "1";
 //BA.debugLineNum = 518;BA.debugLine="DT_Boolean = \"boolean\"";
_dt_boolean = "boolean";
 //BA.debugLineNum = 519;BA.debugLine="selectedNodeClass = \"\"";
_selectednodeclass = "";
 //BA.debugLineNum = 520;BA.debugLine="alternatingRowStyle = False";
_alternatingrowstyle = __c.False;
 //BA.debugLineNum = 521;BA.debugLine="avoidOverlappingGridLines = False";
_avoidoverlappinggridlines = __c.False;
 //BA.debugLineNum = 522;BA.debugLine="pageSize = 10";
_pagesize = (int) (10);
 //BA.debugLineNum = 523;BA.debugLine="mSeriesL.Initialize";
_mseriesl.Initialize();
 //BA.debugLineNum = 524;BA.debugLine="nodeClass = \"\"";
_nodeclass = "";
 //BA.debugLineNum = 525;BA.debugLine="Region = \"\"";
_region = "";
 //BA.debugLineNum = 526;BA.debugLine="Width = \"100%\"";
_width = "100%";
 //BA.debugLineNum = 527;BA.debugLine="Height = \"100%\"";
_height = "100%";
 //BA.debugLineNum = 528;BA.debugLine="hAxisTitle = \"\"";
_haxistitle = "";
 //BA.debugLineNum = 529;BA.debugLine="vAxisTitle = \"\"";
_vaxistitle = "";
 //BA.debugLineNum = 530;BA.debugLine="firstRowNumber = 1";
_firstrownumber = (int) (1);
 //BA.debugLineNum = 531;BA.debugLine="IsDataView = False";
_isdataview = __c.False;
 //BA.debugLineNum = 532;BA.debugLine="showRowLabels = True";
_showrowlabels = __c.True;
 //BA.debugLineNum = 533;BA.debugLine="startPage = 0";
_startpage = (int) (0);
 //BA.debugLineNum = 534;BA.debugLine="Top = \"0\"";
_top = "0";
 //BA.debugLineNum = 535;BA.debugLine="Animate = False";
_animate = __c.False;
 //BA.debugLineNum = 536;BA.debugLine="AnimationEasing = AnimationEasingEnum.AELinear";
_animationeasing = _animationeasingenum.AELinear /*String*/ ;
 //BA.debugLineNum = 537;BA.debugLine="allowHtml = False";
_allowhtml = __c.False;
 //BA.debugLineNum = 538;BA.debugLine="rtlTable = False";
_rtltable = __c.False;
 //BA.debugLineNum = 539;BA.debugLine="sortAscending = True";
_sortascending = __c.True;
 //BA.debugLineNum = 540;BA.debugLine="ColumnBarFormats.Initialize";
_columnbarformats.Initialize();
 //BA.debugLineNum = 541;BA.debugLine="Left = \"0\"";
_left = "0";
 //BA.debugLineNum = 542;BA.debugLine="Title = \"\"";
_title = "";
 //BA.debugLineNum = 543;BA.debugLine="XAxis = \"\"";
_xaxis = "";
 //BA.debugLineNum = 544;BA.debugLine="YAxis = \"\"";
_yaxis = "";
 //BA.debugLineNum = 545;BA.debugLine="hAxisMaxValue = -1";
_haxismaxvalue = -1;
 //BA.debugLineNum = 546;BA.debugLine="hAxisMinValue = -1";
_haxisminvalue = -1;
 //BA.debugLineNum = 547;BA.debugLine="vAxisMaxValue = -1";
_vaxismaxvalue = -1;
 //BA.debugLineNum = 548;BA.debugLine="vAxisMinValue = -1";
_vaxisminvalue = -1;
 //BA.debugLineNum = 549;BA.debugLine="SaveToo = True";
_savetoo = __c.True;
 //BA.debugLineNum = 550;BA.debugLine="HTML = \"\"";
_html = "";
 //BA.debugLineNum = 551;BA.debugLine="isStacked = False";
_isstacked = __c.False;
 //BA.debugLineNum = 552;BA.debugLine="allowCollapse = False";
_allowcollapse = __c.False;
 //BA.debugLineNum = 553;BA.debugLine="enableRegionInteractivity = False";
_enableregioninteractivity = __c.False;
 //BA.debugLineNum = 554;BA.debugLine="DetectClick = False";
_detectclick = __c.False;
 //BA.debugLineNum = 555;BA.debugLine="BubbleFontSize = 11";
_bubblefontsize = (int) (11);
 //BA.debugLineNum = 557;BA.debugLine="PageEnum.Disable = \"disable\"";
_pageenum.Disable /*String*/  = "disable";
 //BA.debugLineNum = 558;BA.debugLine="PageEnum.Enable = \"enable\"";
_pageenum.Enable /*String*/  = "enable";
 //BA.debugLineNum = 559;BA.debugLine="PageEnum.Event = \"event\"";
_pageenum.Event /*String*/  = "event";
 //BA.debugLineNum = 560;BA.debugLine="DT_Time = \"time\"";
_dt_time = "time";
 //BA.debugLineNum = 561;BA.debugLine="NumberFormatOption.decimalSymbol = \".\"";
_numberformatoption.decimalSymbol /*String*/  = ".";
 //BA.debugLineNum = 562;BA.debugLine="NumberFormatOption.fractionDigits = \"2\"";
_numberformatoption.fractionDigits /*String*/  = "2";
 //BA.debugLineNum = 563;BA.debugLine="NumberFormatOption.groupingSymbol = \",\"";
_numberformatoption.groupingSymbol /*String*/  = ",";
 //BA.debugLineNum = 564;BA.debugLine="NumberFormatOption.negativeColor = \"red\"";
_numberformatoption.negativeColor /*String*/  = "red";
 //BA.debugLineNum = 565;BA.debugLine="NumberFormatOption.negativeParens = True";
_numberformatoption.negativeParens /*boolean*/  = __c.True;
 //BA.debugLineNum = 566;BA.debugLine="NumberFormatOption.pattern = \"\"";
_numberformatoption.pattern /*String*/  = "";
 //BA.debugLineNum = 567;BA.debugLine="NumberFormatOption.prefix = \"$\"";
_numberformatoption.prefix /*String*/  = "$";
 //BA.debugLineNum = 568;BA.debugLine="NumberFormatOption.suffix = \"\"";
_numberformatoption.suffix /*String*/  = "";
 //BA.debugLineNum = 570;BA.debugLine="ColumnFormatEnum.PatternFormat = \"PatternFormat\"";
_columnformatenum.PatternFormat /*String*/  = "PatternFormat";
 //BA.debugLineNum = 571;BA.debugLine="ColumnFormatEnum.NumberFmt = \"NumberFormat\"";
_columnformatenum.NumberFmt /*String*/  = "NumberFormat";
 //BA.debugLineNum = 572;BA.debugLine="ColumnFormatEnum.OwnDatePattern = \"OwnDatePattern";
_columnformatenum.OwnDatePattern /*String*/  = "OwnDatePattern";
 //BA.debugLineNum = 573;BA.debugLine="ColumnFormatEnum.MediumDate = \"MediumDate\"";
_columnformatenum.MediumDate /*String*/  = "MediumDate";
 //BA.debugLineNum = 574;BA.debugLine="ColumnFormatEnum.ShortDate = \"ShortDate\"";
_columnformatenum.ShortDate /*String*/  = "ShortDate";
 //BA.debugLineNum = 575;BA.debugLine="ColumnFormatEnum.LongDate = \"LongDate\"";
_columnformatenum.LongDate /*String*/  = "LongDate";
 //BA.debugLineNum = 576;BA.debugLine="ColumnFormatEnum.ArrowFormat = \"ArrowFormat\"";
_columnformatenum.ArrowFormat /*String*/  = "ArrowFormat";
 //BA.debugLineNum = 577;BA.debugLine="ColumnFormatEnum.BarFormat = \"BarFormat\"";
_columnformatenum.BarFormat /*String*/  = "BarFormat";
 //BA.debugLineNum = 578;BA.debugLine="BarFormatOption.bfBase = 0";
_barformatoption.bfBase /*long*/  = (long) (0);
 //BA.debugLineNum = 579;BA.debugLine="BarFormatOption.bfColorNegative = \"red\" ' only ac";
_barformatoption.bfColorNegative /*String*/  = "red";
 //BA.debugLineNum = 580;BA.debugLine="BarFormatOption.bfColorPositive = \"blue\" ' only a";
_barformatoption.bfColorPositive /*String*/  = "blue";
 //BA.debugLineNum = 581;BA.debugLine="BarFormatOption.bfDrawZeroLine = False";
_barformatoption.bfDrawZeroLine /*boolean*/  = __c.False;
 //BA.debugLineNum = 582;BA.debugLine="BarFormatOption.bfMax = -1";
_barformatoption.bfMax /*long*/  = (long) (-1);
 //BA.debugLineNum = 583;BA.debugLine="BarFormatOption.bfMin = -1";
_barformatoption.bfMin /*long*/  = (long) (-1);
 //BA.debugLineNum = 584;BA.debugLine="BarFormatOption.bfShowValue = True";
_barformatoption.bfShowValue /*boolean*/  = __c.True;
 //BA.debugLineNum = 585;BA.debugLine="BarFormatOption.bfWidth = 100";
_barformatoption.bfWidth /*int*/  = (int) (100);
 //BA.debugLineNum = 587;BA.debugLine="NodeSizeEnum.NodeSmall = \"small\"";
_nodesizeenum.NodeSmall /*String*/  = "small";
 //BA.debugLineNum = 588;BA.debugLine="NodeSizeEnum.NodeLarge = \"large\"";
_nodesizeenum.NodeLarge /*String*/  = "large";
 //BA.debugLineNum = 589;BA.debugLine="NodeSizeEnum.NodeMedium = \"medium\"";
_nodesizeenum.NodeMedium /*String*/  = "medium";
 //BA.debugLineNum = 590;BA.debugLine="ResolutionTypeEnum.Countries = \"countries\"";
_resolutiontypeenum.Countries /*String*/  = "countries";
 //BA.debugLineNum = 591;BA.debugLine="ResolutionTypeEnum.Metros = \"metros\"";
_resolutiontypeenum.Metros /*String*/  = "metros";
 //BA.debugLineNum = 592;BA.debugLine="ResolutionTypeEnum.Provinces = \"provinces\"";
_resolutiontypeenum.Provinces /*String*/  = "provinces";
 //BA.debugLineNum = 593;BA.debugLine="DisplayModeTypeEnum.Auto = \"auto\"";
_displaymodetypeenum.Auto /*String*/  = "auto";
 //BA.debugLineNum = 594;BA.debugLine="DisplayModeTypeEnum.Markers = \"markers\"";
_displaymodetypeenum.Markers /*String*/  = "markers";
 //BA.debugLineNum = 595;BA.debugLine="DisplayModeTypeEnum.Regions = \"regions\"";
_displaymodetypeenum.Regions /*String*/  = "regions";
 //BA.debugLineNum = 596;BA.debugLine="SeriesTypeEnum.Area = \"area\"";
_seriestypeenum.Area /*String*/  = "area";
 //BA.debugLineNum = 597;BA.debugLine="SeriesTypeEnum.Bars = \"bars\"";
_seriestypeenum.Bars /*String*/  = "bars";
 //BA.debugLineNum = 598;BA.debugLine="SeriesTypeEnum.CandleSticks = \"candlesticks\"";
_seriestypeenum.CandleSticks /*String*/  = "candlesticks";
 //BA.debugLineNum = 599;BA.debugLine="SeriesTypeEnum.Line = \"line\"";
_seriestypeenum.Line /*String*/  = "line";
 //BA.debugLineNum = 600;BA.debugLine="SeriesTypeEnum.SteppedArea = \"steppedarea\"";
_seriestypeenum.SteppedArea /*String*/  = "steppedarea";
 //BA.debugLineNum = 601;BA.debugLine="ChartTypeEnum.Table = \"Table\"";
_charttypeenum.Table /*String*/  = "Table";
 //BA.debugLineNum = 602;BA.debugLine="ChartTypeEnum.SteppedAreaChart = \"SteppedAreaChar";
_charttypeenum.SteppedAreaChart /*String*/  = "SteppedAreaChart";
 //BA.debugLineNum = 603;BA.debugLine="ChartTypeEnum.ScatterChart = \"ScatterChart\"";
_charttypeenum.ScatterChart /*String*/  = "ScatterChart";
 //BA.debugLineNum = 604;BA.debugLine="ChartTypeEnum.AreaChart = \"AreaChart\"";
_charttypeenum.AreaChart /*String*/  = "AreaChart";
 //BA.debugLineNum = 605;BA.debugLine="ChartTypeEnum.Gauge = \"Gauge\"";
_charttypeenum.Gauge /*String*/  = "Gauge";
 //BA.debugLineNum = 606;BA.debugLine="ChartTypeEnum.PieChart = \"PieChart\"";
_charttypeenum.PieChart /*String*/  = "PieChart";
 //BA.debugLineNum = 607;BA.debugLine="ChartTypeEnum.BarChart = \"BarChart\"";
_charttypeenum.BarChart /*String*/  = "BarChart";
 //BA.debugLineNum = 608;BA.debugLine="ChartTypeEnum.GeoChart = \"GeoChart\"";
_charttypeenum.GeoChart /*String*/  = "GeoChart";
 //BA.debugLineNum = 609;BA.debugLine="ChartTypeEnum.StackedBarChart = \"StackedBarChart\"";
_charttypeenum.StackedBarChart /*String*/  = "StackedBarChart";
 //BA.debugLineNum = 610;BA.debugLine="ChartTypeEnum.OrgChart = \"OrgChart\"";
_charttypeenum.OrgChart /*String*/  = "OrgChart";
 //BA.debugLineNum = 611;BA.debugLine="ChartTypeEnum.BubbleChart = \"BubbleChart\"";
_charttypeenum.BubbleChart /*String*/  = "BubbleChart";
 //BA.debugLineNum = 612;BA.debugLine="ChartTypeEnum.StackedColumnChart = \"StackedColumn";
_charttypeenum.StackedColumnChart /*String*/  = "StackedColumnChart";
 //BA.debugLineNum = 613;BA.debugLine="ChartTypeEnum.ColumnChart = \"ColumnChart\"";
_charttypeenum.ColumnChart /*String*/  = "ColumnChart";
 //BA.debugLineNum = 614;BA.debugLine="ChartTypeEnum.ComboChart = \"ComboChart\"";
_charttypeenum.ComboChart /*String*/  = "ComboChart";
 //BA.debugLineNum = 615;BA.debugLine="ChartTypeEnum.LineChart = \"LineChart\"";
_charttypeenum.LineChart /*String*/  = "LineChart";
 //BA.debugLineNum = 616;BA.debugLine="ChartTypeEnum.Timeline = \"Timeline\"";
_charttypeenum.Timeline /*String*/  = "Timeline";
 //BA.debugLineNum = 617;BA.debugLine="ChartTypeEnum.MapChart = \"MapChart\"";
_charttypeenum.MapChart /*String*/  = "MapChart";
 //BA.debugLineNum = 618;BA.debugLine="ChartTypeEnum.Motionchart = \"MotionChart\"";
_charttypeenum.Motionchart /*String*/  = "MotionChart";
 //BA.debugLineNum = 619;BA.debugLine="ChartTypeEnum.Donut = \"Donut\"";
_charttypeenum.Donut /*String*/  = "Donut";
 //BA.debugLineNum = 620;BA.debugLine="LegendPositionEnum.Top = \"top\"";
_legendpositionenum.Top /*String*/  = "top";
 //BA.debugLineNum = 621;BA.debugLine="LegendPositionEnum.Left = \"left\"";
_legendpositionenum.Left /*String*/  = "left";
 //BA.debugLineNum = 622;BA.debugLine="LegendPositionEnum.Right = \"right\"";
_legendpositionenum.Right /*String*/  = "right";
 //BA.debugLineNum = 623;BA.debugLine="LegendPositionEnum.Bottom = \"bottom\"";
_legendpositionenum.Bottom /*String*/  = "bottom";
 //BA.debugLineNum = 624;BA.debugLine="LegendPositionEnum.None = \"none\"";
_legendpositionenum.None /*String*/  = "none";
 //BA.debugLineNum = 625;BA.debugLine="LegendAlignmentEnum.AtCenter = \"center\"";
_legendalignmentenum.AtCenter /*String*/  = "center";
 //BA.debugLineNum = 626;BA.debugLine="LegendAlignmentEnum.AtEnd = \"end\"";
_legendalignmentenum.AtEnd /*String*/  = "end";
 //BA.debugLineNum = 627;BA.debugLine="LegendAlignmentEnum.AtStart = \"start\"";
_legendalignmentenum.AtStart /*String*/  = "start";
 //BA.debugLineNum = 628;BA.debugLine="PieSliceTextEnum.IsLabel = \"label\"";
_pieslicetextenum.IsLabel /*String*/  = "label";
 //BA.debugLineNum = 629;BA.debugLine="PieSliceTextEnum.IsNone = \"none\"";
_pieslicetextenum.IsNone /*String*/  = "none";
 //BA.debugLineNum = 630;BA.debugLine="PieSliceTextEnum.IsPercentage = \"percentage\"";
_pieslicetextenum.IsPercentage /*String*/  = "percentage";
 //BA.debugLineNum = 631;BA.debugLine="PieSliceTextEnum.IsValue = \"value\"";
_pieslicetextenum.IsValue /*String*/  = "value";
 //BA.debugLineNum = 632;BA.debugLine="AnimationEasingEnum.AEIn = \"in\"";
_animationeasingenum.AEIn /*String*/  = "in";
 //BA.debugLineNum = 633;BA.debugLine="AnimationEasingEnum.AEinAndOut = \"intAndOut\"";
_animationeasingenum.AEinAndOut /*String*/  = "intAndOut";
 //BA.debugLineNum = 634;BA.debugLine="AnimationEasingEnum.AELinear = \"linear\"";
_animationeasingenum.AELinear /*String*/  = "linear";
 //BA.debugLineNum = 635;BA.debugLine="AnimationEasingEnum.AEOut = \"out\"";
_animationeasingenum.AEOut /*String*/  = "out";
 //BA.debugLineNum = 636;BA.debugLine="LegendPosition = LegendPositionEnum.Bottom";
_legendposition = _legendpositionenum.Bottom /*String*/ ;
 //BA.debugLineNum = 637;BA.debugLine="LegendAlignment = LegendAlignmentEnum.AtStart";
_legendalignment = _legendalignmentenum.AtStart /*String*/ ;
 //BA.debugLineNum = 638;BA.debugLine="PieSliceText = PieSliceTextEnum.IsPercentage";
_pieslicetext = _pieslicetextenum.IsPercentage /*String*/ ;
 //BA.debugLineNum = 639;BA.debugLine="ChartType = ChartTypeEnum.PieChart";
_charttype = _charttypeenum.PieChart /*String*/ ;
 //BA.debugLineNum = 640;BA.debugLine="BackgroundColor = \"white\"";
_backgroundcolor = "white";
 //BA.debugLineNum = 641;BA.debugLine="reverseCategories = False";
_reversecategories = __c.False;
 //BA.debugLineNum = 642;BA.debugLine="is3D = False";
_is3d = __c.False;
 //BA.debugLineNum = 643;BA.debugLine="RedFrom = 50";
_redfrom = (int) (50);
 //BA.debugLineNum = 644;BA.debugLine="RedTo = 100";
_redto = (int) (100);
 //BA.debugLineNum = 645;BA.debugLine="sortColumn = -1";
_sortcolumn = (int) (-1);
 //BA.debugLineNum = 646;BA.debugLine="YellowFrom = 25";
_yellowfrom = (int) (25);
 //BA.debugLineNum = 647;BA.debugLine="YellowTo = 50";
_yellowto = (int) (50);
 //BA.debugLineNum = 648;BA.debugLine="MinorTicks = 5";
_minorticks = (int) (5);
 //BA.debugLineNum = 649;BA.debugLine="MajorTicks = 5";
_majorticks = (int) (5);
 //BA.debugLineNum = 650;BA.debugLine="greenFrom = 0";
_greenfrom = (int) (0);
 //BA.debugLineNum = 651;BA.debugLine="greenTo = 25";
_greento = (int) (25);
 //BA.debugLineNum = 652;BA.debugLine="MaxGauge = 100";
_maxgauge = (int) (100);
 //BA.debugLineNum = 653;BA.debugLine="MinGauge = 0";
_mingauge = (int) (0);
 //BA.debugLineNum = 654;BA.debugLine="FontName = \"Tahoma\"";
_fontname = "Tahoma";
 //BA.debugLineNum = 655;BA.debugLine="FontSize = 10";
_fontsize = (int) (10);
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public boolean  _isdatecolumn(String _columnname) throws Exception{
boolean _rvalue = false;
int _i = 0;
String _fldname = "";
String _fldtype = "";
 //BA.debugLineNum = 394;BA.debugLine="Public Sub IsDateColumn(ColumnName As String) As B";
 //BA.debugLineNum = 395;BA.debugLine="Dim rValue as Boolean = False";
_rvalue = __c.False;
 //BA.debugLineNum = 396;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 397;BA.debugLine="Dim fldName As String = FieldsAndTypes.GetKeyAt(";
_fldname = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
 //BA.debugLineNum = 398;BA.debugLine="Dim fldType As String = FieldsAndTypes.GetValueA";
_fldtype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
 //BA.debugLineNum = 399;BA.debugLine="If fldName.ToLowerCase = ColumnName.ToLowerCase";
if ((_fldname.toLowerCase()).equals(_columnname.toLowerCase())) { 
 //BA.debugLineNum = 400;BA.debugLine="If fldType = DT_Date Then";
if ((_fldtype).equals(_dt_date)) { 
 //BA.debugLineNum = 401;BA.debugLine="rValue = True";
_rvalue = __c.True;
 //BA.debugLineNum = 402;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 404;BA.debugLine="rValue = False";
_rvalue = __c.False;
 //BA.debugLineNum = 405;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 //BA.debugLineNum = 409;BA.debugLine="Return rValue";
if (true) return _rvalue;
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return false;
}
public boolean  _istimecolumn(String _columnname) throws Exception{
boolean _rvalue = false;
int _i = 0;
String _fldname = "";
String _fldtype = "";
 //BA.debugLineNum = 412;BA.debugLine="Public Sub IsTimeColumn(ColumnName As String) As B";
 //BA.debugLineNum = 413;BA.debugLine="Dim rValue As Boolean= False";
_rvalue = __c.False;
 //BA.debugLineNum = 414;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 415;BA.debugLine="Dim fldName As String = FieldsAndTypes.GetKeyAt(";
_fldname = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
 //BA.debugLineNum = 416;BA.debugLine="Dim fldType As String = FieldsAndTypes.GetValueA";
_fldtype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
 //BA.debugLineNum = 417;BA.debugLine="If fldName.ToLowerCase = ColumnName.ToLowerCase";
if ((_fldname.toLowerCase()).equals(_columnname.toLowerCase())) { 
 //BA.debugLineNum = 418;BA.debugLine="If fldType = DT_Time Then";
if ((_fldtype).equals(_dt_time)) { 
 //BA.debugLineNum = 419;BA.debugLine="rValue = True";
_rvalue = __c.True;
 //BA.debugLineNum = 420;BA.debugLine="Exit";
if (true) break;
 }else {
 //BA.debugLineNum = 422;BA.debugLine="rValue = False";
_rvalue = __c.False;
 //BA.debugLineNum = 423;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 //BA.debugLineNum = 427;BA.debugLine="Return rValue";
if (true) return _rvalue;
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return false;
}
public String  _makedate(String _dvalue) throws Exception{
int _inty = 0;
int _intm = 0;
int _intd = 0;
 //BA.debugLineNum = 684;BA.debugLine="Sub MakeDate(dValue As String) As String";
 //BA.debugLineNum = 687;BA.debugLine="Dim intY As Int";
_inty = 0;
 //BA.debugLineNum = 688;BA.debugLine="Dim intM As Int";
_intm = 0;
 //BA.debugLineNum = 689;BA.debugLine="Dim intD As Int";
_intd = 0;
 //BA.debugLineNum = 690;BA.debugLine="intY = MvField(dValue, 3, \"/\")";
_inty = (int)(Double.parseDouble(_mvfield(_dvalue,(int) (3),"/")));
 //BA.debugLineNum = 691;BA.debugLine="intM = MvField(dValue, 2, \"/\")";
_intm = (int)(Double.parseDouble(_mvfield(_dvalue,(int) (2),"/")));
 //BA.debugLineNum = 692;BA.debugLine="intD = MvField(dValue, 1, \"/\")";
_intd = (int)(Double.parseDouble(_mvfield(_dvalue,(int) (1),"/")));
 //BA.debugLineNum = 693;BA.debugLine="Return \"new Date(\" & intY & \", \" & intM & \", \" &";
if (true) return "new Date("+BA.NumberToString(_inty)+", "+BA.NumberToString(_intm)+", "+BA.NumberToString(_intd)+")";
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return "";
}
public String  _maketime(String _dvalue) throws Exception{
int _inth = 0;
int _intm = 0;
 //BA.debugLineNum = 696;BA.debugLine="Sub MakeTime(dValue As String) As String";
 //BA.debugLineNum = 697;BA.debugLine="Dim intH As Int";
_inth = 0;
 //BA.debugLineNum = 698;BA.debugLine="Dim intM As Int";
_intm = 0;
 //BA.debugLineNum = 699;BA.debugLine="intH = MvField(dValue, 1, \":\")";
_inth = (int)(Double.parseDouble(_mvfield(_dvalue,(int) (1),":")));
 //BA.debugLineNum = 700;BA.debugLine="intM = MvField(dValue, 2, \":\")";
_intm = (int)(Double.parseDouble(_mvfield(_dvalue,(int) (2),":")));
 //BA.debugLineNum = 701;BA.debugLine="Return \"new Date(0, 0, 0, \" & intH & \", \" & intM";
if (true) return "new Date(0, 0, 0, "+BA.NumberToString(_inth)+", "+BA.NumberToString(_intm)+", 0)";
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return "";
}
public int  _mapkeyposition(anywheresoftware.b4a.objects.collections.Map _m,String _k) throws Exception{
int _p = 0;
int _i = 0;
String _sk = "";
 //BA.debugLineNum = 1362;BA.debugLine="Sub MapKeyPosition(m As Map, k As String) As Int";
 //BA.debugLineNum = 1363;BA.debugLine="Dim p As Int = -1";
_p = (int) (-1);
 //BA.debugLineNum = 1364;BA.debugLine="For i = 0 To m.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_m.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1365;BA.debugLine="Dim sk As String = m.GetKeyAt(i)";
_sk = BA.ObjectToString(_m.GetKeyAt(_i));
 //BA.debugLineNum = 1366;BA.debugLine="If sk.ToLowerCase = k.ToLowerCase Then";
if ((_sk.toLowerCase()).equals(_k.toLowerCase())) { 
 //BA.debugLineNum = 1367;BA.debugLine="p = i";
_p = _i;
 //BA.debugLineNum = 1368;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 1371;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 1372;BA.debugLine="End Sub";
return 0;
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
String[] _mvalues = null;
int _tvalues = 0;
 //BA.debugLineNum = 673;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 674;BA.debugLine="Dim mValues() As String";
_mvalues = new String[(int) (0)];
java.util.Arrays.fill(_mvalues,"");
 //BA.debugLineNum = 675;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 676;BA.debugLine="mValues = Regex.split(Delimiter, sValue)";
_mvalues = __c.Regex.Split(_delimiter,_svalue);
 //BA.debugLineNum = 677;BA.debugLine="tValues = mValues.Length -1";
_tvalues = (int) (_mvalues.length-1);
 //BA.debugLineNum = 678;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 679;BA.debugLine="If iPosition <= -1 Then Return mValues(tValues)";
if (_iposition<=-1) { 
if (true) return _mvalues[_tvalues];};
 //BA.debugLineNum = 680;BA.debugLine="If iPosition > tValues Then Return \"\"";
if (_iposition>_tvalues) { 
if (true) return "";};
 //BA.debugLineNum = 681;BA.debugLine="Return mValues(iPosition)";
if (true) return _mvalues[_iposition];
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return "";
}
public String  _mvremoveblanks(String _svalue,String _delim) throws Exception{
anywheresoftware.b4a.objects.collections.List _sb = null;
String[] _spvalues = null;
int _i = 0;
String _sline = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbs = null;
 //BA.debugLineNum = 162;BA.debugLine="Sub MvRemoveBlanks(sValue As String, Delim As Stri";
 //BA.debugLineNum = 164;BA.debugLine="Dim sb As List";
_sb = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 165;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 166;BA.debugLine="Dim spValues() As String";
_spvalues = new String[(int) (0)];
java.util.Arrays.fill(_spvalues,"");
 //BA.debugLineNum = 167;BA.debugLine="spValues = Regex.Split(Delim,sValue)";
_spvalues = __c.Regex.Split(_delim,_svalue);
 //BA.debugLineNum = 168;BA.debugLine="For i = 0 To spValues.Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_spvalues.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 169;BA.debugLine="Dim sLine As String: sLine = spValues(i).Trim";
_sline = "";
 //BA.debugLineNum = 169;BA.debugLine="Dim sLine As String: sLine = spValues(i).Trim";
_sline = _spvalues[_i].trim();
 //BA.debugLineNum = 170;BA.debugLine="If sLine.Length > 0 Then sb.Add(sLine)";
if (_sline.length()>0) { 
_sb.Add((Object)(_sline));};
 }
};
 //BA.debugLineNum = 172;BA.debugLine="Dim sbs As StringBuilder";
_sbs = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 173;BA.debugLine="sbs.Initialize";
_sbs.Initialize();
 //BA.debugLineNum = 174;BA.debugLine="For i = 0 To sb.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_sb.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 175;BA.debugLine="If i > 0 Then sbs.Append(Delim)";
if (_i>0) { 
_sbs.Append(_delim);};
 //BA.debugLineNum = 176;BA.debugLine="sbs.Append(sb.Get(i))";
_sbs.Append(BA.ObjectToString(_sb.Get(_i)));
 }
};
 //BA.debugLineNum = 178;BA.debugLine="Return sbs.tostring";
if (true) return _sbs.ToString();
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _orgchartreset() throws Exception{
 //BA.debugLineNum = 906;BA.debugLine="Sub OrgChartReset()";
 //BA.debugLineNum = 907;BA.debugLine="AddColumn(\"Name\", DT_String)";
_addcolumn("Name",_dt_string);
 //BA.debugLineNum = 908;BA.debugLine="AddColumn(\"Manager\", DT_String)";
_addcolumn("Manager",_dt_string);
 //BA.debugLineNum = 909;BA.debugLine="AddColumn(\"ToolTip\", DT_String)";
_addcolumn("ToolTip",_dt_string);
 //BA.debugLineNum = 910;BA.debugLine="AddColumn(\"ToolTipColor\", DT_String)";
_addcolumn("ToolTipColor",_dt_string);
 //BA.debugLineNum = 911;BA.debugLine="AddColumn(\"ToolTipItalic\", DT_String)";
_addcolumn("ToolTipItalic",_dt_string);
 //BA.debugLineNum = 912;BA.debugLine="End Sub";
return "";
}
public String  _seriescolorsset(String _seriesname,String _color) throws Exception{
 //BA.debugLineNum = 666;BA.debugLine="Sub SeriesColorsSet(SeriesName As String, Color As";
 //BA.debugLineNum = 669;BA.debugLine="SeriesColors.Put(SeriesName, Color)";
_seriescolors.Put((Object)(_seriesname),(Object)(_color));
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnemailformat(String _columnname) throws Exception{
int _colpos = 0;
 //BA.debugLineNum = 205;BA.debugLine="Sub SetColumnEmailFormat(ColumnName As String)";
 //BA.debugLineNum = 206;BA.debugLine="Dim colPos As Int: colPos = ColumnPosition(Column";
_colpos = 0;
 //BA.debugLineNum = 206;BA.debugLine="Dim colPos As Int: colPos = ColumnPosition(Column";
_colpos = _columnposition(_columnname);
 //BA.debugLineNum = 207;BA.debugLine="AddColumnPatternFormat(ColumnName, QUOTE & \"<a hr";
_addcolumnpatternformat(_columnname,__c.QUOTE+"<a href="+__c.QUOTE+"mailto:{"+BA.NumberToString(_colpos)+"}"+__c.QUOTE+">{"+BA.NumberToString(_colpos)+"}</a>"+__c.QUOTE);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnnumberpattern(String _columnname,String _pattern) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetColumnNumberPattern(ColumnName As String, P";
 //BA.debugLineNum = 226;BA.debugLine="AddColumnNumberFormat(ColumnName, \".\", \"2\", \",\" ,";
_addcolumnnumberformat(_columnname,".","2",",","black",__c.False,_pattern,"","");
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _singlequote(String _svalue) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub SingleQuote(sValue As String) As String";
 //BA.debugLineNum = 659;BA.debugLine="Return \"'\" & sValue & \"'\"";
if (true) return "'"+_svalue+"'";
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
