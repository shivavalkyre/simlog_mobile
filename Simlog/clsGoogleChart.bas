Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=2.71
@EndOfDesignText@
'Class module


Sub Class_Globals
	Type focusTargetType(datum As String, category As String)
	Public focusTargetEnum As focusTargetType
	Public focusTarget As String
	Type curveTypeType(None As String, Function As String)
	Public curveTypeEnum As curveTypeType
	Public curveType As String
	Type axisTitlesPositionType(AxisIn As String, AxisOut As String, AxisNone As String)
	Public axisTitlesPositionEnum As axisTitlesPositionType
	Public axisTitlesPosition As String
	Public hAxisslantedTextAngle As Int
	Public hAxisslantedText As Boolean
	Public ZoomLevel As Int
	Public useMapTypeControl As Boolean
	Public lineColor As String
	Public lineWidth As Int
	Public DT_String As String
	Public DT_Number As String
	Public DT_Date As String
	Public DT_DateTime As String
	Public DT_TimeOfDay As String
	Public DT_Boolean As String
	Public DT_Time As String
	Public rtlTable As Boolean
	Public showLine As Boolean
	Public AnimationDuration As Int
	Public enableScrollWheel As Boolean
	Public showTip As Boolean 
	Public avoidOverlappingGridLines As Boolean
	Public XAxis As String  ' define the x axis title
	Public YAxis As String	' define the y axis title
	Private X As List		' the x values
	Private Y As List		' the y values
	Public Title As String	' the title of the chart
	Public Width As String		' the width of the chart
	Public Height As String	' the height of the class
	Public pageSize As Int
	Public backgroundColorInHex As String
	Public sortColumn As Int
	Public showRowLabels As Boolean
	Public singleColorInHex As String
	Public groupByRowLabel As Boolean
	Public colorByRowLabel As Boolean
	Public Region As String
	Public allowCollapse As Boolean
	Public sortAscending As Boolean
	Public Top As String
	Public Left As String
	Public firstRowNumber As Int
	Public isStacked As Boolean 
	Public allowHtml As Boolean
	Public startPage As Int
	Public HTML As String	' the html code for the chart
	Public SaveToo As Boolean
	Public DetectClick As Boolean
	Public BubbleFontSize As Int 
	Public MasterSeries As List
	Public showRowNumber As Boolean
	Public hAxisTitle As String
	Public vAxisTitle As String
	Public alternatingRowStyle As Boolean
	Public keepAspectRatio As Boolean 
	Public nodeClass As String
	Public selectedNodeClass As String
	Public enableRegionInteractivity As Boolean
	Public magnifyingGlassEnable As Boolean
	Public hAxisMaxValue As Double
	Public hAxisMinValue As Double
	Public vAxisMaxValue As Double
	Public vAxisMinValue As Double
	Public magnifyingGlassZoomFactor As Double
	Type DataTypeType(DT_String As String,DT_Number As String, DT_Date As String, DT_DateTime As String, DT_TimeOfDay As String, DT_Boolean As String, DT_Time As String)
	Public DataTypeEnum As DataTypeType
	
	Type AnimationEasingType(AELinear As String, AEIn As String, AEOut As String, AEinAndOut As String)
	Public AnimationEasingEnum As AnimationEasingType
	Public AnimationEasing As String
	Type SeriesType1(Line As String, Area As String, Bars As String, CandleSticks As String, SteppedArea As String)
	Public SeriesTypeEnum As SeriesType1
	Public SeriesType As String
	Type PieSliceTextType(IsPercentage As String, IsValue As String, IsLabel As String, IsNone As String)
	Public PieSliceTextEnum As PieSliceTextType
	Public PieSliceText As String
	Type LegendAlignmentType (AtStart As String, AtCenter As String, AtEnd As String)
	Public LegendAlignmentEnum As LegendAlignmentType
	Public LegendAlignment As String
	Type LegendPositionType(Top As String, Left As String, Right As String, Bottom As String, None As String)
	Public LegendPositionEnum As LegendPositionType
	Public LegendPosition As String
	Type ChartsType(PieChart As String, LineChart As String, StackedBarChart As String, StackedColumnChart As String, AreaChart As String, ColumnChart As String, GeoChart As String, ComboChart As String, Gauge As String, OrgChart As String, BubbleChart As String, Timeline As String, Donut As String, MapChart As String, ScatterChart As String, Table As String, BarChart As String, Motionchart As String, SteppedAreaChart As String)
	Public ChartTypeEnum As ChartsType
	Public ChartType As String
	Type DisplayModeType(Auto As String, Regions As String, Markers As String)
	Public DisplayModeTypeEnum As DisplayModeType
	Public DisplayMode As String
	Type ResolutionType(Countries As String, Provinces As String, Metros As String)
	Public ResolutionTypeEnum As ResolutionType
	Public Resolution As String
	Type MapTypeType(Normal As String, Terrain As String, Satellite As String, Hybrid As String)
	Public MapTypeEnum As MapTypeType
	Public MapType As String
	Type NodeSizeType(NodeSmall As String, NodeMedium As String, NodeLarge As String)
	Type ZoomLevelType(Automatic As String, Number As String)
	Public ZoomLevelEnum As ZoomLevelType
	Public ZoomLevelOf As String
	Public ZoomLevel As Int
	Public NodeSizeEnum As NodeSizeType
	Public NodeSize As String
	
	Type ColumnFormatType(MediumDate As String, ShortDate As String, LongDate As String, ArrowFormat As String, BarFormat As String, OwnDatePattern As String, PatternFormat As String, NumberFmt As String)
	Public ColumnFormatEnum As ColumnFormatType
	Public ColumnFormat As String
	
	Type PageType(Enable As String, Event As String, Disable As String)
	Public PageEnum As PageType
	Public Page As String
	Type SortType(Enable As String, Event As String, Disable As String)
	Public SortEnum As SortType
	
	Type BarFormatType(bfBase As Long, bfColorNegative As String, bfColorPositive As String, bfDrawZeroLine As Boolean, bfMax As Long, bfMin As Long, bfShowValue As Boolean, bfWidth As Int)
	Public BarFormatOption As BarFormatType
	
	Type NumberFormatType(decimalSymbol As String, fractionDigits As String, groupingSymbol As String, negativeColor As String, negativeParens As Boolean, pattern As String, prefix As String, suffix As String)
	Public NumberFormatOption As NumberFormatType
	
	Public Sort As String
	Public Version As String
	Public RedFrom As Int
	Public RedTo As Int
	Public YellowFrom As Int
	Public YellowTo As Int
	Public MinorTicks As Int
	Public MajorTicks As Int
	Public greenFrom As Int
	Public greenTo As Int
	Public MaxGauge As Int
	Public MinGauge As Int
	Public BackgroundColor As String
	Public FontSize As Int
	Public FontName As String
	Public IsDataView As Boolean
	Public is3D As Boolean
	Public reverseCategories As Boolean
	Public mseries As Map
	Public enableInteractivity As Boolean
	Public Animate As Boolean
	Public ColorAxisColors As Map
	Public SeriesTypes As Map
	Public DefaultSeriesType As String
	Public FieldsAndTypes As Map
	Public ColumnFormats As Map
	Public ColumnBarFormats As Map
	Public OwnPatterns As Map
	Public ColumnNumberFormats As Map
	Public mSeriesL As List
	Public SeriesColors As Map
End Sub

Sub MvRemoveBlanks(sValue As String, Delim As String) As String
	' remove blank items from a delimited string
	Dim sb As List
	sb.Initialize 
	Dim spValues() As String
	spValues = Regex.Split(Delim,sValue)
	For i = 0 To spValues.Length - 1
		Dim sLine As String: sLine = spValues(i).Trim 
		If sLine.Length > 0 Then sb.Add(sLine)
	Next
	Dim sbs As StringBuilder
	sbs.Initialize 
	For i = 0 To sb.Size - 1
		If i > 0 Then sbs.Append(Delim)
		sbs.Append(sb.Get(i))
	Next
	Return sbs.tostring
End Sub

Sub ColumnPosition(ColumnName As String) As Int
	Return MasterSeries.IndexOf(ColumnName)
End Sub

Sub AddColumnFormat(ColumnName As String, cColumnFormat As String)
	ColumnFormats.Put(ColumnName, cColumnFormat)
End Sub

Sub AddColumnOwnDateFormat(ColumnName As String, cPattern As String)
	ColumnFormats.Put(ColumnName, ColumnFormatEnum.OwnDatePattern)
	Dim cm As Map
	cm.Initialize 
	cm.Put("pattern", cPattern)
	OwnPatterns.Put(ColumnName, cm)
End Sub

Sub AddColumnPatternFormat(ColumnName As String, cPattern As String)
	ColumnFormats.Put(ColumnName, ColumnFormatEnum.PatternFormat)
	Dim cm As Map
	cm.Initialize 
	cm.Put("pattern",QUOTE & cPattern & QUOTE)
	OwnPatterns.Put(ColumnName, cm)
End Sub

Sub SetColumnEmailFormat(ColumnName As String)
	Dim colPos As Int: colPos = ColumnPosition(ColumnName)	
	AddColumnPatternFormat(ColumnName, QUOTE & "<a href=" & QUOTE & "mailto:{" & colPos & "}" & QUOTE & ">{" & colPos & "}</a>" & QUOTE)
End Sub

Sub AddColumnBarFormat(ColumnName As String, bfBase As Float, bfColorNegative As String, bfColorPositive As String, bfDrawZeroLine As Boolean, bfMax As Float, bfMin As Float, bfShowValue As Boolean, bfWidth As Int)
	ColumnFormats.Put(ColumnName, ColumnFormatEnum.BarFormat) 
	Dim cm As Map
	cm.Initialize
	cm.Put("base", bfBase)
	cm.Put("colornegative", bfColorNegative)
	cm.Put("colorpositive", bfColorPositive)
	cm.Put("drawzeroline", bfDrawZeroLine)
	cm.Put("max", bfMax)
	cm.Put("min", bfMin)
	cm.Put("showvalue", bfShowValue)
	cm.Put("width", bfWidth)
	ColumnBarFormats.Put(ColumnName, cm)
End Sub

Sub SetColumnNumberPattern(ColumnName As String, Pattern As String)
	AddColumnNumberFormat(ColumnName, ".", "2", "," , "black", False, Pattern, "", "")
End Sub

Sub AddColumnNumberFormat(ColumnName As String, decimalSymbol As String, fractionDigits As String, groupingSymbol As String, negativeColor As String, negativeParens As Boolean, pattern As String, prefix As String, suffix As String)
	ColumnFormats.Put(ColumnName, ColumnFormatEnum.NumberFmt) 
	Dim cm As Map
	cm.Initialize
	cm.Put("decimalSymbol", decimalSymbol)
	cm.Put("fractionDigits", fractionDigits)
	cm.Put("groupingSymbol", groupingSymbol)
	cm.Put("negativeColor", negativeColor)
	cm.Put("negativeParens", negativeParens)
	cm.Put("pattern", pattern)
	cm.Put("prefix", prefix)
	cm.Put("suffix", suffix)
	ColumnNumberFormats.Put(ColumnName, cm)
End Sub

' render scripts to create the data table
Sub BuildDataTable() As String
	' process the columns
	Dim clsPB As clsPB
	Dim xy As Int = 0
	clsPB.Initialize
	clsPB.AppendLine("var data = new google.visualization.DataTable();")
	For i = 0 To FieldsAndTypes.Size - 1
		Dim field As String: field = FieldsAndTypes.GetKeyAt(i)
		Dim ftype As String: ftype = FieldsAndTypes.GetValueAt(i)
		If ftype = DT_Time Then ftype = DT_Date
		clsPB.AppendLine("data.addColumn('" & ftype & "', '" & field & "');")
	Next
	clsPB.AppendLine("data.addRows([") 
	' process the rows
	Dim sb As StringBuilder
	sb.Initialize
	' loop through each row
	For i = 0 To mseries.Size - 1
		If i > 0 Then sb.Append("," & CRLF)
		' get the row details
		Dim mRow As Map
		mRow.Initialize
		mRow = mseries.GetValueAt(i) 
		sb.Append("[")
		' loop through each column
		For xy = 0 To FieldsAndTypes.Size - 1
			If xy > 0 Then sb.Append(", ")
			Dim field1 As String: field1 = FieldsAndTypes.GetKeyAt(xy)
			Dim ftype1 As String: ftype1 = FieldsAndTypes.GetValueAt(xy)
			Dim fValue As Object = mRow.Get(field1)
			If fValue = Null Then fValue = mseries.GetKeyAt(i)  
			Select Case ftype1
			Case DT_Number, DT_Date, DT_DateTime, DT_TimeOfDay, DT_Boolean, DT_Time
				sb.Append(fValue) 
			Case DT_String
				sb.Append("'" & fValue & "'") 
			End Select
		Next
		sb.Append("]")
	Next
	clsPB.Append(sb.ToString)
	clsPB.appendline("]);")
	Return clsPB.ToString
End Sub

Sub BuildMapArray() As String
	' process the columns
	Dim clsPB As clsPB
	Dim xy As Int = 0
	Dim field As String
	clsPB.Initialize
	clsPB.AppendLine("var data = google.visualization.arrayToDataTable([")
	clsPB.Append("[")
	For i = 1 To FieldsAndTypes.Size - 1
		field = FieldsAndTypes.GetKeyAt(i)
		clsPB.append("'" & field & "', ")
	Next
	field = FieldsAndTypes.GetKeyAt(0)
	clsPB.append("'" & field & "'")
	clsPB.AppendLine("],")
	' process the rows
	Dim sb As StringBuilder
	sb.Initialize
	' loop through each row
	For i = 0 To mseries.Size - 1
		If i > 0 Then sb.Append("," & CRLF)
		' get the row details
		Dim mRow As Map
		mRow.Initialize
		mRow = mseries.GetValueAt(i) 
		sb.Append("[")
		' loop through each column
		For xy = 1 To FieldsAndTypes.Size - 1
			Dim field1 As String: field1 = FieldsAndTypes.GetKeyAt(xy)
			Dim ftype1 As String: ftype1 = FieldsAndTypes.GetValueAt(xy)
			Dim fValue As Object = mRow.Get(field1)
			If fValue = Null Then fValue = mseries.GetKeyAt(i)  
			Select Case ftype1
			Case DT_Number, DT_Date, DT_DateTime, DT_TimeOfDay, DT_Boolean, DT_Time
				sb.Append(fValue) 
			Case DT_String
				sb.Append("'" & fValue & "'") 
			End Select
			sb.Append(", ")
		Next
		Dim field1 As String: field1 = FieldsAndTypes.GetKeyAt(0)
		Dim ftype1 As String: ftype1 = FieldsAndTypes.GetValueAt(0)
		Dim fValue As Object = mRow.Get(field1)
		If fValue = Null Then fValue = mseries.GetKeyAt(i)  
		Select Case ftype1
		Case DT_Number, DT_Date, DT_DateTime, DT_TimeOfDay, DT_Boolean, DT_Time
			sb.Append(fValue) 
		Case DT_String
			sb.Append("'" & fValue & "'") 
		End Select
		sb.Append("]")
	Next
	clsPB.Append(sb.ToString)
	clsPB.appendline("]);")
	Return clsPB.ToString
End Sub


' render scripts to create the data table for org chart
Sub BuildOrgChart() As String
	' process the columns
	Dim clsPB As clsPB
	clsPB.Initialize
	clsPB.AppendLine("var data = new google.visualization.DataTable();")
	For i = 0 To FieldsAndTypes.Size - 1
		Dim Field As String: Field = FieldsAndTypes.GetKeyAt(i)
		Dim ftype As String: ftype = FieldsAndTypes.GetValueAt(i)
		If ftype = DT_Time Then ftype = DT_Date
		If Field = "ToolTipColor" OR Field = "ToolTipItalic" Then
		Else
			clsPB.AppendLine("data.addColumn('" & ftype & "', '" & Field & "');")
		End If
	Next
	clsPB.AppendLine("data.addRows([") 
	' process the rows
	For i = 0 To mseries.Size - 1
		If i > 0 Then clsPB.Append(",")
		Dim M As Map
		M.Initialize
		M = mseries.GetValueAt(i) 
		Dim sName As String: sName = M.Get("Name")
		Dim sManager As String: sManager = M.Get("Manager")
		Dim sToolTip As String: sToolTip = M.Get("ToolTip")
		Dim sToolTipColor As String: sToolTipColor = M.Get("ToolTipColor")
		Dim sToolTipItalic As String: sToolTipItalic = M.Get("ToolTipItalic")
		Dim sLine As String = ""
		If sToolTipItalic.ToLowerCase = "y" Then sToolTipItalic = "italic"
		If sToolTipItalic.tolowercase = "N" Then sToolTipItalic = "normal"
		sLine = "[{v:'" & sName & "', f:'" & sName
		sLine = sLine & "<div style=" & QUOTE & "color:" & sToolTipColor
		sLine = sLine & "; font-style:" & sToolTipItalic & QUOTE & ">" & sToolTip
		sLine = sLine & "</div>'}, '" & sManager & "', '" & sToolTip & "']"
		clsPB.AppendLine(sLine) 
	Next
	clsPB.appendline("]);")
	Return clsPB.ToString
End Sub


Public Sub AddColumn(ColumnName As String, ColumnType As String)
	FieldsAndTypes.Put(ColumnName, ColumnType)
	If MasterSeries.IndexOf(ColumnName) = -1 Then MasterSeries.Add(ColumnName)
End Sub

Public Sub IsDateColumn(ColumnName As String) As Boolean
	Dim rValue as Boolean = False
	For i = 0 To FieldsAndTypes.Size - 1
		Dim fldName As String = FieldsAndTypes.GetKeyAt(i)
		Dim fldType As String = FieldsAndTypes.GetValueAt(i)
		If fldName.ToLowerCase = ColumnName.ToLowerCase Then
			If fldType = DT_Date Then
				rValue = True
				Exit
			Else
				rValue = False
				Exit
			End If
		End If
	Next
	Return rValue
End Sub

Public Sub IsTimeColumn(ColumnName As String) As Boolean
	Dim rValue As Boolean= False
	For i = 0 To FieldsAndTypes.Size - 1
		Dim fldName As String = FieldsAndTypes.GetKeyAt(i)
		Dim fldType As String = FieldsAndTypes.GetValueAt(i)
		If fldName.ToLowerCase = ColumnName.ToLowerCase Then
			If fldType = DT_Time Then
				rValue = True
				Exit
			Else
				rValue = False
				Exit
			End If
		End If
	Next
	Return rValue
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	AnimationEasingEnum.Initialize
	SeriesTypeEnum.Initialize 
	PieSliceTextEnum.Initialize
	LegendAlignmentEnum.Initialize 
	LegendPositionEnum.Initialize 
	ChartTypeEnum.Initialize
	DisplayModeTypeEnum.Initialize
	ResolutionTypeEnum.Initialize
	NodeSizeEnum.Initialize 
	ColumnFormatEnum.Initialize 
	PageEnum.Initialize 
	SortEnum.Initialize
	SortEnum.Disable = "disable"
	SortEnum.Enable = "enable"
	SortEnum.Event = "event"
	BarFormatOption.Initialize 
	NumberFormatOption.Initialize
	
	X.Initialize
	Y.Initialize
	focusTargetEnum.Initialize
	focusTargetEnum.datum = "datum"
	focusTargetEnum.category = "category"
	focusTarget = focusTargetEnum.datum 
	curveTypeEnum.Initialize 
	curveTypeEnum.Function = "function"
	curveTypeEnum.None = "none"
	curveType = curveTypeEnum.None 
	axisTitlesPositionEnum.Initialize
	axisTitlesPositionEnum.AxisIn = "in"
	axisTitlesPositionEnum.AxisNone = "none"
	axisTitlesPositionEnum.AxisOut = "out"
	axisTitlesPosition = axisTitlesPositionEnum.AxisOut 
	hAxisslantedTextAngle = 45
	hAxisslantedText = False
	ZoomLevelEnum.Initialize 
	ZoomLevelEnum.Automatic = "automatic"
	ZoomLevelEnum.Number = "number"
	ZoomLevelOf = ZoomLevelEnum.Automatic 
	MapTypeEnum.Initialize 
	MapTypeEnum.Hybrid = "hybrid"
	MapTypeEnum.Normal = "normal"
	MapTypeEnum.Satellite = "satellite"
	MapTypeEnum.Terrain = "terrain"
	MapType = MapTypeEnum.Hybrid 
	ZoomLevel = 0
	useMapTypeControl = False
	lineColor = ""
	lineWidth = 10
	showLine = False
	showTip = False
	enableScrollWheel = False
	AnimationDuration = 1000
	SeriesColors.Initialize 
	ColumnFormats.Initialize 
	FieldsAndTypes.Initialize 
	DefaultSeriesType = ""
	mseries.Initialize
	SeriesTypes.Initialize 
	ColumnNumberFormats.Initialize 
	enableInteractivity = True
	showRowNumber = False
	keepAspectRatio = False
	MasterSeries.Initialize
	ColorAxisColors.Initialize
	singleColorInHex = ""
	backgroundColorInHex = ""
	magnifyingGlassEnable = False
	colorByRowLabel = False
	OwnPatterns.Initialize 
	magnifyingGlassZoomFactor = 5.0
	groupByRowLabel = False
	DT_String = "string"
	DT_Number = "number"
	DT_Date = "date"
	DT_DateTime = "datetime"
	DT_TimeOfDay = "timeofday"
	DataTypeEnum.Initialize 
	DataTypeEnum.DT_Boolean = "boolean"
	DataTypeEnum.DT_Date = "date"
	DataTypeEnum.DT_Number = "number"
	DataTypeEnum.DT_String = "string"
	DataTypeEnum.DT_TimeOfDay = "timeofday"
	DataTypeEnum.DT_DateTime = "datetime"
	DataTypeEnum.DT_Time = "time"
	Version = "1"
	DT_Boolean = "boolean"
	selectedNodeClass = ""
	alternatingRowStyle = False
	avoidOverlappingGridLines = False
	pageSize = 10
	mSeriesL.Initialize 
	nodeClass = ""
	Region = ""
	Width = "100%"
	Height = "100%"
	hAxisTitle = ""
	vAxisTitle = ""
	firstRowNumber = 1
	IsDataView = False
	showRowLabels = True
	startPage = 0
	Top = "0"
	Animate = False
	AnimationEasing = AnimationEasingEnum.AELinear 
	allowHtml = False
	rtlTable = False
	sortAscending = True
	ColumnBarFormats.Initialize 
	Left = "0"
	Title = ""
	XAxis = ""
	YAxis = ""
	hAxisMaxValue = -1
	hAxisMinValue = -1
	vAxisMaxValue = -1
	vAxisMinValue = -1
	SaveToo = True
	HTML = ""
	isStacked = False
	allowCollapse = False
	enableRegionInteractivity = False
	DetectClick = False
	BubbleFontSize = 11
	
	PageEnum.Disable = "disable"
	PageEnum.Enable = "enable"
	PageEnum.Event = "event"
	DT_Time = "time"
	NumberFormatOption.decimalSymbol = "."
	NumberFormatOption.fractionDigits = "2"
	NumberFormatOption.groupingSymbol = ","
	NumberFormatOption.negativeColor = "red"
	NumberFormatOption.negativeParens = True
	NumberFormatOption.pattern = ""
	NumberFormatOption.prefix = "$"
	NumberFormatOption.suffix = ""
	
	ColumnFormatEnum.PatternFormat = "PatternFormat"
	ColumnFormatEnum.NumberFmt = "NumberFormat"
	ColumnFormatEnum.OwnDatePattern = "OwnDatePattern"
	ColumnFormatEnum.MediumDate = "MediumDate"
	ColumnFormatEnum.ShortDate = "ShortDate"
	ColumnFormatEnum.LongDate = "LongDate"
	ColumnFormatEnum.ArrowFormat = "ArrowFormat"
	ColumnFormatEnum.BarFormat = "BarFormat"
	BarFormatOption.bfBase = 0
	BarFormatOption.bfColorNegative = "red" ' only accept red, green, blue
	BarFormatOption.bfColorPositive = "blue" ' only accept red, green, blue
	BarFormatOption.bfDrawZeroLine = False
	BarFormatOption.bfMax = -1
	BarFormatOption.bfMin = -1
	BarFormatOption.bfShowValue = True
	BarFormatOption.bfWidth = 100
	
	NodeSizeEnum.NodeSmall = "small"
	NodeSizeEnum.NodeLarge = "large"
	NodeSizeEnum.NodeMedium = "medium"
	ResolutionTypeEnum.Countries = "countries"
	ResolutionTypeEnum.Metros = "metros"
	ResolutionTypeEnum.Provinces = "provinces"
	DisplayModeTypeEnum.Auto = "auto"
	DisplayModeTypeEnum.Markers = "markers"
	DisplayModeTypeEnum.Regions = "regions"
	SeriesTypeEnum.Area = "area"
	SeriesTypeEnum.Bars = "bars"
	SeriesTypeEnum.CandleSticks = "candlesticks"
	SeriesTypeEnum.Line = "line"
	SeriesTypeEnum.SteppedArea = "steppedarea"
	ChartTypeEnum.Table = "Table"
	ChartTypeEnum.SteppedAreaChart = "SteppedAreaChart"
	ChartTypeEnum.ScatterChart = "ScatterChart"
	ChartTypeEnum.AreaChart = "AreaChart"
	ChartTypeEnum.Gauge = "Gauge"
	ChartTypeEnum.PieChart = "PieChart"
	ChartTypeEnum.BarChart = "BarChart"
	ChartTypeEnum.GeoChart = "GeoChart"
	ChartTypeEnum.StackedBarChart = "StackedBarChart"
	ChartTypeEnum.OrgChart = "OrgChart"
	ChartTypeEnum.BubbleChart = "BubbleChart"
	ChartTypeEnum.StackedColumnChart = "StackedColumnChart"
	ChartTypeEnum.ColumnChart = "ColumnChart"
	ChartTypeEnum.ComboChart = "ComboChart"
	ChartTypeEnum.LineChart = "LineChart"
	ChartTypeEnum.Timeline = "Timeline"
	ChartTypeEnum.MapChart = "MapChart"
	ChartTypeEnum.Motionchart = "MotionChart"
	ChartTypeEnum.Donut = "Donut"
	LegendPositionEnum.Top = "top"
	LegendPositionEnum.Left = "left"
	LegendPositionEnum.Right = "right"
	LegendPositionEnum.Bottom = "bottom"
	LegendPositionEnum.None = "none"
	LegendAlignmentEnum.AtCenter = "center"
	LegendAlignmentEnum.AtEnd = "end"
	LegendAlignmentEnum.AtStart = "start"
	PieSliceTextEnum.IsLabel = "label"
	PieSliceTextEnum.IsNone = "none"
	PieSliceTextEnum.IsPercentage = "percentage"
	PieSliceTextEnum.IsValue = "value"
	AnimationEasingEnum.AEIn = "in"
	AnimationEasingEnum.AEinAndOut = "intAndOut"
	AnimationEasingEnum.AELinear = "linear"
	AnimationEasingEnum.AEOut = "out"
	LegendPosition = LegendPositionEnum.Bottom
	LegendAlignment = LegendAlignmentEnum.AtStart
	PieSliceText = PieSliceTextEnum.IsPercentage
	ChartType = ChartTypeEnum.PieChart 
	BackgroundColor = "white"
	reverseCategories = False
	is3D = False
	RedFrom = 50
	RedTo = 100
	sortColumn = -1
	YellowFrom = 25
	YellowTo = 50
	MinorTicks = 5
	MajorTicks = 5
	greenFrom = 0
	greenTo = 25
	MaxGauge = 100
	MinGauge = 0
	FontName = "Tahoma"
	FontSize = 10
End Sub

Sub SingleQuote(sValue As String) As String
	Return "'" & sValue & "'"
End Sub

Sub DoubleQuote(sValue As String) As String
	Return QUOTE & sValue & QUOTE
End Sub

Sub SeriesColorsSet(SeriesName As String, Color As String)
	' if zero is used, use a random color
	'If Color = 0 Then Color = Colors.RGB(Rnd(0, 255), Rnd(0, 255), Rnd(0, 255))
	SeriesColors.Put(SeriesName, Color)
End Sub

' get a multi value field
Sub MvField(sValue As String, iPosition As Int, Delimiter As String) As String
	Dim mValues() As String
	Dim tValues As Int
	mValues = Regex.split(Delimiter, sValue)
	tValues = mValues.Length -1
	iPosition = iPosition - 1
	If iPosition <= -1 Then Return mValues(tValues)
	If iPosition > tValues Then Return ""
	Return mValues(iPosition)
End Sub

Sub MakeDate(dValue As String) As String
	' convert dd/MM/yyyy format to date value for the google 
	' chart to interpret
	Dim intY As Int
	Dim intM As Int
	Dim intD As Int
	intY = MvField(dValue, 3, "/")
	intM = MvField(dValue, 2, "/")
	intD = MvField(dValue, 1, "/")
	Return "new Date(" & intY & ", " & intM & ", " & intD & ")"
End Sub

Sub MakeTime(dValue As String) As String
	Dim intH As Int
	Dim intM As Int
	intH = MvField(dValue, 1, ":")
	intM = MvField(dValue, 2, ":")
	Return "new Date(0, 0, 0, " & intH & ", " & intM & ", 0)"
End Sub

' add the xy points to the chart
Sub AddXY(XValue As Object, YValue As Object)
	x.Add(XValue)
	y.Add(YValue)
	If MasterSeries.Size = 2 Then
		Dim sKey As String = MasterSeries.Get(0)
		Dim sFld As String = MasterSeries.Get(1)
		' check if field is date
		If IsDateColumn(sKey) Then XValue = MakeDate(XValue)
		If IsDateColumn(sFld) Then YValue = MakeDate(YValue)
		If IsTimeColumn(sKey) Then XValue = MakeTime(XValue)
		If IsTimeColumn(sFld) Then YValue = MakeTime(YValue)
		Dim M As Map
		M.Initialize
		M.Put(sKey, XValue)
		M.Put(sFld, YValue)
		AddRow(XValue, M)
	End If
End Sub

' add the xyy points to the chart
Sub AddXYY(XValue As Object, YValue1 As Object, YValue2 As Object)
	If MasterSeries.Size = 3 Then
		Dim sKey As String = MasterSeries.Get(0)
		Dim sFld0 As String = MasterSeries.Get(1)
		Dim sFld1 As String = MasterSeries.Get(2)
		If IsDateColumn(sKey) Then XValue = MakeDate(XValue)
		If IsDateColumn(sFld0) Then YValue1 = MakeDate(YValue1)
		If IsDateColumn(sFld1) Then YValue2 = MakeDate(YValue2)
		' check if time
		If IsTimeColumn(sKey) Then XValue = MakeTime(XValue)
		If IsTimeColumn(sFld0) Then YValue1 = MakeTime(YValue1)
		If IsTimeColumn(sFld1) Then YValue2 = MakeTime(YValue2)
		
		Dim M As Map
		M.Initialize
		M.Put(sKey, XValue)
		M.Put(sFld0, YValue1)
		M.Put(sFld1, YValue2)
		AddRow(XValue, M)
	End If
End Sub

' add the xyyy points to the chart
Sub AddXYYY(XValue As Object, YValue1 As Object, YValue2 As Object, YValue3 As Object)
	If MasterSeries.Size = 4 Then
		Dim sKey As String = MasterSeries.Get(0)
		Dim sFld0 As String = MasterSeries.Get(1)
		Dim sFld1 As String = MasterSeries.Get(2)
		Dim sFld2 As String = MasterSeries.Get(3)
		If IsDateColumn(sKey) Then XValue = MakeDate(XValue)
		If IsDateColumn(sFld0) Then YValue1 = MakeDate(YValue1)
		If IsDateColumn(sFld1) Then YValue2 = MakeDate(YValue2)
		If IsDateColumn(sFld2) Then YValue3 = MakeDate(YValue3)
		' check if time
		If IsTimeColumn(sKey) Then XValue = MakeTime(XValue)
		If IsTimeColumn(sFld0) Then YValue1 = MakeTime(YValue1)
		If IsTimeColumn(sFld1) Then YValue2 = MakeTime(YValue2)
		If IsTimeColumn(sFld2) Then YValue3 = MakeTime(YValue3)
		
		Dim M As Map
		M.Initialize
		M.Put(sKey, XValue)
		M.Put(sFld0, YValue1)
		M.Put(sFld1, YValue2)
		M.Put(sFld2, YValue3)
		AddRow(XValue, M)
	End If
End Sub

Sub AddXYYYY(XValue As Object, YValue1 As Object, YValue2 As Object, YValue3 As Object, YValue4 As Object)
	If MasterSeries.Size = 5 Then
		Dim sKey As String = MasterSeries.Get(0)
		Dim sFld0 As String = MasterSeries.Get(1)
		Dim sFld1 As String = MasterSeries.Get(2)
		Dim sFld2 As String = MasterSeries.Get(3)
		Dim sFld3 As String = MasterSeries.Get(4)
		If IsDateColumn(sKey) Then XValue = MakeDate(XValue)
		If IsDateColumn(sFld0) Then YValue1 = MakeDate(YValue1)
		If IsDateColumn(sFld1) Then YValue2 = MakeDate(YValue2)
		If IsDateColumn(sFld2) Then YValue3 = MakeDate(YValue3)
		If IsDateColumn(sFld3) Then YValue4 = MakeDate(YValue4)
		' check if time
		If IsTimeColumn(sKey) Then XValue = MakeTime(XValue)
		If IsTimeColumn(sFld0) Then YValue1 = MakeTime(YValue1)
		If IsTimeColumn(sFld1) Then YValue2 = MakeTime(YValue2)
		If IsTimeColumn(sFld2) Then YValue3 = MakeTime(YValue3)
		If IsTimeColumn(sFld3) Then YValue4 = MakeTime(YValue4)
		
		Dim M As Map
		M.Initialize
		M.Put(sKey, XValue)
		M.Put(sFld0, YValue1)
		M.Put(sFld1, YValue2)
		M.Put(sFld2, YValue3)
		M.Put(sFld3, YValue4)
		AddRow(XValue, M)
	End If
End Sub

Sub AddXYYYYY(XValue As Object, YValue1 As Object, YValue2 As Object, YValue3 As Object, YValue4 As Object, YValue5 As Object)
	If MasterSeries.Size = 6 Then
		Dim sKey As String = MasterSeries.Get(0)
		Dim sFld0 As String = MasterSeries.Get(1)
		Dim sFld1 As String = MasterSeries.Get(2)
		Dim sFld2 As String = MasterSeries.Get(3)
		Dim sFld3 As String = MasterSeries.Get(4)
		Dim sFld4 As String = MasterSeries.Get(5)
		If IsDateColumn(sKey) Then XValue = MakeDate(XValue)
		If IsDateColumn(sFld0) Then YValue1 = MakeDate(YValue1)
		If IsDateColumn(sFld1) Then YValue2 = MakeDate(YValue2)
		If IsDateColumn(sFld2) Then YValue3 = MakeDate(YValue3)
		If IsDateColumn(sFld3) Then YValue4 = MakeDate(YValue4)
		If IsDateColumn(sFld4) Then YValue5 = MakeDate(YValue5)
		' check if time
		If IsTimeColumn(sKey) Then XValue = MakeTime(XValue)
		If IsTimeColumn(sFld0) Then YValue1 = MakeTime(YValue1)
		If IsTimeColumn(sFld1) Then YValue2 = MakeTime(YValue2)
		If IsTimeColumn(sFld2) Then YValue3 = MakeTime(YValue3)
		If IsTimeColumn(sFld3) Then YValue4 = MakeTime(YValue4)
		If IsTimeColumn(sFld4) Then YValue5 = MakeTime(YValue5)
		
		Dim M As Map
		M.Initialize
		M.Put(sKey, XValue)
		M.Put(sFld0, YValue1)
		M.Put(sFld1, YValue2)
		M.Put(sFld2, YValue3)
		M.Put(sFld3, YValue4)
		M.Put(sFld4, YValue5)
		AddRow(XValue, M)
	End If
End Sub

Sub AddSeriesType(SeriesLocation As Int, sSeriesType As String)
	SeriesTypes.put(SeriesLocation, sSeriesType)
End Sub

Sub AddColorAxisColors(sColor As String)
	ColorAxisColors.put(sColor,"")
End Sub

Sub AddGauge(sLabel As String, sValue As String)
	x.Add(sLabel)
	y.Add(sValue)
	If MasterSeries.Size = 2 Then
		Dim sKey As String = MasterSeries.Get(0)
		Dim sFld As String = MasterSeries.Get(1)
		Dim M As Map
		M.Initialize
		M.Put(sKey, sLabel)
		M.Put(sFld, sValue)
		AddRow(sLabel, M)
	End If
End Sub

Sub AddRow(sKey As String, M As Map)
	mseries.Put(sKey, M)
	For i = 0 To M.Size - 1
		Dim sKey As String = M.GetKeyAt(i)
		If MasterSeries.IndexOf(sKey) = -1 Then MasterSeries.Add(sKey)
	Next
	' add to list for timeline
	mSeriesL.Add(M)
End Sub

Sub AddColumnsXY(ColumnName As String, XValue As String, YValue As String)
	' if the series does not exist, add it
	If MasterSeries.IndexOf(ColumnName) = -1 Then MasterSeries.Add(ColumnName)
	' the x value is used to store the column names
	Dim xExists As Boolean
	xExists = mseries.ContainsKey(XValue)
	Dim M As Map
	M.Initialize
	If xExists = True Then
		' the x value exist, put a value of the Y linked to the series
		M = mseries.Get(XValue)
		If IsDateColumn(ColumnName) Then YValue = MakeDate(YValue)
		If IsTimeColumn(ColumnName) Then YValue = MakeTime(YValue)
		M.Put(ColumnName, YValue)
	Else
		' the xvalue map does not exist, link it to the series
		If IsDateColumn(ColumnName) Then YValue = MakeDate(YValue)
		If IsTimeColumn(ColumnName) Then YValue = MakeTime(YValue)
		M.Put(ColumnName, YValue)
	End If
	' put the map that contains the series and value names into an x value map
	mseries.Put(XValue, M)
	mSeriesL.Add(M)
End Sub

Sub BuildColorAxis() As String
	Dim sHeader As String = ""
	sHeader = "["
	For i = 0 To ColorAxisColors.Size - 1
		If i > 0 Then sHeader = sHeader & ", "
		sHeader = sHeader & "'" & ColorAxisColors.GetKeyAt(i) & "'"
	Next
	sHeader = sHeader & "]"
	Return sHeader	
End Sub

Sub OrgChartReset()
	AddColumn("Name", DT_String)
	AddColumn("Manager", DT_String)
	AddColumn("ToolTip", DT_String)
	AddColumn("ToolTipColor", DT_String)
	AddColumn("ToolTipItalic", DT_String)
End Sub

Sub AddPerson(FullName As String, JobTitle As String, ReportsTo As String, ToolTipColor As String, ToolTipItalic As String)
	Dim rowM As Map
	rowM.Initialize
	rowM.Put("Name", FullName)
	rowM.Put("Manager", ReportsTo)
	rowM.Put("ToolTip", JobTitle)
	rowM.Put("ToolTipColor", ToolTipColor)
	rowM.Put("ToolTipItalic", ToolTipItalic)
	AddRow(FullName, rowM)
End Sub

' generate the html for the chart and render
Sub DrawChart(WebView As WebView)
	' draw the map, the height and widths have been commented not to limit the map
	Dim clsMPB As clsPB
	clsMPB.Initialize 
	Dim clsPB As clsPB
	clsMPB.Appendline("<html>")
	clsMPB.appendline("<head>")
	clsMPB.appendline("<!--Load the AJAX API-->")
	clsMPB.append("<script ")
	clsPB.Initialize
	clsPB.AddProperty("type", "text/javascript")
	clsPB.AddProperty("src", "https://www.google.com/jsapi")
	clsMPB.append(clsPB.Render)
	' render the property
	clsMPB.appendline("></script>")
	clsMPB.append("<script ")
	' render property
	clsPB.Initialize
	clsPB.AddProperty("type", "text/javascript")
	clsMPB.append(clsPB.Render)
	clsMPB.appendline(">")
	clsMPB.appendline("// Load the Visualization API and the relevant package.")
	
	#Region Bubble, Column, Bar, Combo Chart
	Select Case ChartType
	Case ChartTypeEnum.Timeline
		clsMPB.appendline("google.load('visualization', '" & Version & "', {'packages':['timeline']});")
	Case ChartTypeEnum.Table
		clsMPB.appendline("google.load('visualization', '" & Version & "', {'packages':['table']});")
	Case ChartTypeEnum.OrgChart
		clsMPB.appendline("google.load('visualization', '" & Version & "', {'packages':['orgchart']});")
	Case ChartTypeEnum.GeoChart
		clsMPB.appendline("google.load('visualization', '" & Version & "', {'packages':['geochart']});")
	Case ChartTypeEnum.Gauge
		clsMPB.appendline("google.load('visualization', '" & Version & "', {'packages':['gauge']});")
	Case ChartTypeEnum.MapChart
		clsMPB.AppendLine("google.load('visualization', '" & Version & "', {'packages':['map']});")
	Case ChartTypeEnum.Motionchart 
		clsMPB.AppendLine("google.load('visualization', '" & Version & "', {'packages':['motionchart']});")
	Case Else
		clsMPB.appendline("google.load('visualization', '" & Version & "', {'packages':['corechart']});")
	End Select
	
	clsMPB.appendline("// Set a callback to run when the Google Visualization API is loaded.")
	clsMPB.appendline("google.setOnLoadCallback(drawChart);")
	clsMPB.appendline("// Callback that creates AND populates a data table,")
   	clsMPB.appendline("// instantiates the pie chart, passes In the data AND")
   	clsMPB.appendline("// draws it.")
   	clsMPB.appendline("function drawChart() {")
	clsMPB.appendline("// Create the data table.")
	
	If XAxis.Length > 0 Then hAxisTitle = XAxis
	If YAxis.Length > 0 Then vAxisTitle = YAxis
	
	If ChartType = ChartTypeEnum.OrgChart Then
		clsMPB.AppendLine(BuildOrgChart)
	Else If ChartType = ChartTypeEnum.Timeline Then
		clsMPB.AppendLine(BuildTimeLine)
	Else If ChartType = ChartTypeEnum.MapChart Then
		clsMPB.AppendLine(BuildMapArray)
	Else
   		clsMPB.AppendLine(BuildDataTable)
	End If
	
	clsMPB.appendline("// Set chart options")
	clsMPB.appendline("var options = {")
	If Title.Length > 0 Then clsMPB.appendline("'title':'" & Title & "',")
	Select Case ChartType
    Case ChartTypeEnum.Donut
        clsMPB.AppendLine("'pieHole': '0.5',")
        is3D = False
        ChartType = ChartTypeEnum.PieChart
    End Select
	'clsMPB.appendline("'majorTicks':" & MajorTicks & ",")
	
	'clsMPB.appendline("'width':" & Width & ",")
	'clsMPB.appendline("'height':" & Height & ",")
	'clsMPB.AppendLine("hAxis.gridlines: {color: 'black', count: 1},")
	'clsMPB.AppendLine("'chartArea.width': '" & Width & "',")
	'clsMPB.AppendLine("'chartArea.height': '" & Height & "',")
	'clsMPB.AppendLine("'chartArea.top': '" & Top & "',")
	'clsMPB.AppendLine("'chartArea.left': '" & Left & "',")
	'clsMPB.appendline("'height':" & Height & ",")
		
	Select Case ChartType
	Case ChartTypeEnum.PieChart
		clsMPB.AppendLine("'pieSliceText': '" & PieSliceText & "',")
		If is3D = True Then clsMPB.AppendLine("'is3D': 'true',")
	Case ChartTypeEnum.Gauge
		clsMPB.appendline("'redFrom':" & RedFrom & ",")
		clsMPB.appendline("'redTo':" & RedTo & ",")
		clsMPB.appendline("'yellowFrom':" & YellowFrom & ",")
		clsMPB.appendline("'yellowTo':" & YellowTo & ",")
		clsMPB.appendline("'greenFrom':" & greenFrom & ",")
		clsMPB.appendline("'greenTo':" & greenTo & ",")
		clsMPB.appendline("'max':" & MaxGauge & ",")
		clsMPB.appendline("'min':" & MinGauge & ",")
		clsMPB.appendline("'minorTicks':" & MinorTicks & ",")
	Case ChartTypeEnum.BubbleChart 
		clsMPB.AppendLine("bubble: {textStyle: {fontSize: " & BubbleFontSize & "}},")
	Case ChartTypeEnum.GeoChart
		clsMPB.appendline("'region':'" & Region & "',")
		clsMPB.appendline("'displayMode':'" & DisplayMode & "',")
		If enableRegionInteractivity = True Then clsMPB.appendline("'enableRegionInteractivity':'true',")
		If keepAspectRatio = True Then clsMPB.appendline("'keepAspectRatio':'true',")
		If magnifyingGlassEnable = True Then 
			clsMPB.appendline("'magnifyingGlass.enable':'true',")
			clsMPB.appendline("'magnifyingGlass.zoomFactor':'" & magnifyingGlassZoomFactor & "',")
		End If
		If Resolution.Length > 0 Then clsMPB.appendline("'resolution':'" & Resolution & "',")
	Case ChartTypeEnum.Timeline
		Dim gbrl As String: gbrl = "false"
		Dim srl As String: srl = "false"
		Dim cbrl As String: cbrl = "false"
		Dim aogl As String: aogl = "false"
		
		If showRowLabels = True Then srl = "true"
		If groupByRowLabel = True Then gbrl = "true"
		If colorByRowLabel = True Then cbrl = "true"
		If avoidOverlappingGridLines = True Then aogl = "true"
		
		clsMPB.append("timeline: {")
		clsMPB.Append("showRowLabels:'" & srl & "',")
		clsMPB.Append("groupByRowLabel:'" & gbrl & "',")
		clsMPB.Append("colorByRowLabel:'" & cbrl & "',")
		clsMPB.Append("avoidOverlappingGridLines:'" & aogl & "',")
		If singleColorInHex <> "" Then clsMPB.Append("singleColor:'" & singleColorInHex & "',")
		If backgroundColorInHex <> "" Then clsMPB.Append("backgroundColor:'" & backgroundColorInHex & "',")
		clsMPB.AppendLine("},")
	Case ChartTypeEnum.Table
		If showRowNumber = True Then clsMPB.AppendLine("'showRowNumber': 'true',")
		If alternatingRowStyle = True Then clsMPB.AppendLine("'alternatingRowStyle': 'true',")
		clsMPB.AppendLine("'firstRowNumber': '" & firstRowNumber & "',")
		clsMPB.AppendLine("'page': '" & Page & "',")
		clsMPB.AppendLine("'pageSize': '" & pageSize & "',")
		If rtlTable = True Then clsMPB.AppendLine("'rtlTable': 'true',")
		clsMPB.AppendLine("'sort': '" & Sort & "',")
		If sortAscending = False Then clsMPB.AppendLine("'sortAscending': 'false',")
		If sortColumn <> -1 Then clsMPB.AppendLine("'sortColumn': '" & sortColumn & "',")
		clsMPB.AppendLine("'startPage': '" & startPage & "',")
	Case ChartTypeEnum.MapChart
		If showTip = True Then clsMPB.AppendLine("'showTip': 'true',")
		If enableScrollWheel = True Then clsMPB.AppendLine("'enableScrollWheel': 'true',")
		If showLine = True Then 
			clsMPB.AppendLine("'showLine': 'true',")
			clsMPB.AppendLine("'lineWidth': '" & lineWidth & "',")
			If lineColor.Length > 0 Then clsMPB.AppendLine("'lineColor': '" & lineColor & "',")
		End If
		If useMapTypeControl = True Then clsMPB.AppendLine("'useMapTypeControl': 'true',")
		If ZoomLevelOf = ZoomLevelEnum.automatic Then
			clsMPB.AppendLine("'zoomLevel': 'automatic',")
		Else
			If ZoomLevel <> -1 Then clsMPB.AppendLine("'zoomLevel': '" & ZoomLevel & "',")
		End If
		If MapType.length > 0 Then clsMPB.AppendLine("'mapType': '" & MapType & "',")
	Case ChartTypeEnum.OrgChart
		If nodeClass.Length > 0 Then clsMPB.AppendLine("'nodeClass': '" & nodeClass & "',")
		If selectedNodeClass.Length > 0 Then clsMPB.AppendLine("'selectedNodeClass': '" & selectedNodeClass & "',")
		If NodeSize.Length > 0 Then clsMPB.AppendLine("'size': '" & NodeSize & "',")
	End Select
	
	If hAxisMaxValue <> -1 Then	clsMPB.appendline("'hAxis.maxValue':" & hAxisMaxValue & ",")
	If hAxisMinValue <> -1 Then	clsMPB.appendline("'hAxis.minValue':" & hAxisMinValue & ",")
	If vAxisMaxValue <> -1 Then	clsMPB.appendline("'vAxis.maxValue':" & vAxisMaxValue & ",")
	If vAxisMinValue <> -1 Then	clsMPB.appendline("'vAxis.minValue':" & vAxisMinValue & ",")
		
	isStacked = False
	If ChartType = ChartTypeEnum.StackedColumnChart Then isStacked = True
	If ChartType = ChartTypeEnum.StackedBarChart Then isStacked = True
	If vAxisTitle.Length > 0 Then clsMPB.AppendLine("vAxis: {title: '" & vAxisTitle & "',  titleTextStyle: {color: 'black'}},")
	If hAxisTitle.Length > 0 Then clsMPB.AppendLine("hAxis: {slantedText: " & hAxisslantedText & ", slantedTextAngle: " & hAxisslantedTextAngle & ", title: '" & hAxisTitle & "',  titleTextStyle: {color: 'black'}},")
	If enableInteractivity = True Then clsMPB.AppendLine("'enableInteractivity': 'true',")
	If reverseCategories = True Then clsMPB.AppendLine("'reverseCategories': 'true',")
	If isStacked = True Then clsMPB.AppendLine("'isStacked': 'true',")
	If axisTitlesPosition <> axisTitlesPositionEnum.axisout Then clsMPB.AppendLine("'axisTitlesPosition': '" & axisTitlesPosition & "',")
	If curveType <> curveTypeEnum.none Then clsMPB.AppendLine("'curveType': '" & curveType & "',")
	If focusTarget <> focusTargetEnum.datum Then clsMPB.AppendLine("'focusTarget': '" & focusTarget & "',")   
	clsMPB.AppendLine("'legend.position': '" & LegendPosition & "',")
	clsMPB.AppendLine("'legend.alignment': '" & LegendAlignment & "',")
	clsMPB.AppendLine("'backgroundColor': '" & BackgroundColor & "',")
	clsMPB.AppendLine("'fontSize': '" & FontSize & "',")
	clsMPB.AppendLine("'fontName': '" & FontName & "',")
		
	If Animate = True Then 
		clsMPB.AppendLine("'animation.duration': " & AnimationDuration & ",")
		clsMPB.AppendLine("'animation.easing': '" & AnimationEasing & "',")
	End If
	
	If DefaultSeriesType.Length > 0 Then
		clsMPB.AppendLine("'seriesType': " & DoubleQuote(DefaultSeriesType) & ",")
	End If
	
	For i = 0 To SeriesTypes.Size - 1
		Dim sLoc As String = SeriesTypes.GetKeyAt(i)
		Dim sType As String = SeriesTypes.GetValueAt(i)
		clsMPB.appendline("series: {" & sLoc & ": {type: " & DoubleQuote(sType) & "}},")
	Next
	
	If ColorAxisColors.Size > 0 Then
		clsMPB.AppendLine("colorAxis: {colors: " & BuildColorAxis & "},")
	End If
	If allowHtml = True Then clsMPB.AppendLine("'allowHtml': 'true',")
	If allowCollapse = True Then clsMPB.AppendLine("'allowCollapse': 'true',")
	
	Select Case ChartType
	Case ChartTypeEnum.PieChart
	 	' generate colors
        Dim colTot As Int = SeriesColors.Size
        If colTot >= 0 Then
            clsMPB.Append("slices: {")
            colTot = colTot - 1
            For i = 0 To colTot
				If i > 0 Then clsMPB.Append(",")
				Dim sColor As String = SeriesColors.GetValueAt(i)
                Dim sColorName As String = SeriesColors.GetKeyAt(i)
				Dim si As Int = MapKeyPosition(mseries, sColorName)
				If si <> -1 Then
            		Dim sLine As String = si & ": {color: '" & sColor & "'}"
            		clsMPB.Append(sLine)
           		End If
			Next
			clsMPB.AppendLine("},")
        End If
	Case Else
		 ' generate colors
        Dim colTot As Int = SeriesColors.Size
        If colTot >= 1 Then
            clsMPB.Append("series: {")
            colTot = colTot - 1
            For i = 0 To colTot
				If i > 0 Then clsMPB.Append(",")
				Dim sColor As String = SeriesColors.GetValueAt(i)
                Dim sColorName As String = SeriesColors.GetKeyAt(i)
				Dim si As Int = ColumnPosition(sColorName)
				If si <> -1 Then
					' first column should be x values not series
					si = si - 1
            		Dim sLine As String = si & ": {color: '" & sColor & "'}"
            		clsMPB.Append(sLine)
           		End If
			Next
			clsMPB.AppendLine("},")
        End If
	End Select
	
	
	clsMPB.AppendLine("};")
	
	' create the column formatters
	For i = 0 To ColumnFormats.Size - 1
		Dim fColumnName As String: fColumnName = ColumnFormats.GetKeyAt(i)
		Dim fColumnFormat As String: fColumnFormat = ColumnFormats.GetValueAt(i)
		Dim varName As String: varName = "var" & fColumnName.Replace(" ","").Replace("_","").Replace("(","").Replace(")","")
		Dim colPos As Int: colPos = ColumnPosition(fColumnName)
		clsMPB.AppendLine("// Create a formatter for the " & fColumnName & " column.")
		clsMPB.AppendLine("// This example uses Object literal notation To define the options.")
		Select Case fColumnFormat
		Case ColumnFormatEnum.MediumDate
			clsMPB.AppendLine("var " & varName & " = new google.visualization.DateFormat({formatType: 'medium'});")
			clsMPB.AppendLine("// Reformat " & fColumnName)
			clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
		Case ColumnFormatEnum.ShortDate
			clsMPB.AppendLine("var " & varName & " = new google.visualization.DateFormat({formatType: 'short'});")
			clsMPB.AppendLine("// Reformat " & fColumnName)
			clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
		Case ColumnFormatEnum.LongDate
			clsMPB.AppendLine("var " & varName & " = new google.visualization.DateFormat({formatType: 'long'});")
			clsMPB.AppendLine("// Reformat " & fColumnName)
			clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
		Case ColumnFormatEnum.ArrowFormat
			clsMPB.AppendLine("var " & varName & " = new google.visualization.ArrowFormat();")
			clsMPB.AppendLine("// Reformat " & fColumnName)
			clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
		Case ColumnFormatEnum.PatternFormat
			If OwnPatterns.ContainsKey(fColumnName) Then
				Dim ownF As Map
				ownF.Initialize
				ownF = OwnPatterns.Get(fColumnName)
				Dim mp As String: mp = ownF.Get("pattern")
				clsMPB.AppendLine("var " & varName & " = new google.visualization.PatternFormat(" & mp & ");")
				clsMPB.AppendLine("// Reformat " & fColumnName)
				clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
			End If
		Case ColumnFormatEnum.OwnDatePattern
			If OwnPatterns.ContainsKey(fColumnName) Then
				Dim ownF As Map
				ownF.Initialize
				ownF = OwnPatterns.Get(fColumnName)
				Dim mp As String: mp = ownF.Get("pattern")
				clsMPB.AppendLine("var " & varName & " = new google.visualization.DateFormat({pattern: " & DoubleQuote(mp) & "});")
				clsMPB.AppendLine("// Reformat " & fColumnName)
				clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
			End If
		Case ColumnFormatEnum.NumberFmt
			If ColumnNumberFormats.ContainsKey(fColumnName) Then
				Dim nf As Map
				nf.Initialize
				nf = ColumnNumberFormats.Get(fColumnName)
				
				Dim decimalSymbol As String: decimalSymbol = nf.get("decimalSymbol")
				Dim fractionDigits As String: fractionDigits = nf.get("fractionDigits")
				Dim groupingSymbol As String: groupingSymbol = nf.get("groupingSymbol")
				Dim negativeColor As String: negativeColor = nf.get("negativeColor")
				Dim negativeParens As Boolean: negativeParens = nf.get("negativeParens")
				Dim pattern As String: pattern = nf.get("pattern")
				Dim prefix As String: prefix = nf.get("prefix")
				Dim suffix As String: suffix = nf.get("suffix")
				
				Dim sx As StringBuilder
				sx.Initialize
				If decimalSymbol <> "." Then sx.Append("decimalSymbol:'" & decimalSymbol).Append("',")
				If fractionDigits <> "2" Then sx.Append("fractionDigits:'" & fractionDigits).Append("',")
				If groupingSymbol <> "," Then sx.Append("groupingSymbol:'" & groupingSymbol).Append("',")
				sx.Append("negativeColor:'" & negativeColor).Append("',")
				If negativeParens = True Then sx.Append("negativeParens:'true").Append("',")
				If pattern <> "" Then sx.Append("pattern:'" & pattern).Append("',")
				sx.Append("prefix:'" & prefix).Append("',")
				sx.Append("suffix:'" & suffix).Append("',")
				Dim sbs As String: sbs = sx.ToString
				sbs = MvRemoveBlanks(sbs, ",")
				clsMPB.AppendLine("var " & varName & " = new google.visualization.NumberFormat({" & sbs & "});")
			Else
				clsMPB.AppendLine("var " & varName & " = new google.visualization.NumberFormat();")
			End If
			clsMPB.AppendLine("// Reformat " & fColumnName)
			clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
		Case ColumnFormatEnum.BarFormat
			If ColumnBarFormats.ContainsKey(fColumnName) Then
				Dim cf As Map
				cf.Initialize 
				cf = ColumnBarFormats.Get(fColumnName) 
				Dim bfBase As Long : bfBase = cf.Get("base")
				Dim bfColorNegative As String: bfColorNegative = cf.get("colornegative")
				Dim bfColorPositive As String: bfColorPositive = cf.get("colorpositive")
				Dim bfDrawZeroLine As Boolean: bfDrawZeroLine = cf.get("drawzeroline")
				Dim bfMax As Long: bfMax = cf.get("max")
				Dim bfMin As Long: bfMin = cf.Get("min")
				Dim bfShowValue As Boolean: bfShowValue = cf.get("showvalue")
				Dim bfWidth As Int: bfWidth = cf.get("width")
				Dim sx As StringBuilder
				sx.Initialize
				If bfBase <> 0 Then sx.Append("base:'" & bfBase).Append("',")
				If bfColorNegative <> "red" Then sx.Append("colorNegative:'" & bfColorNegative).Append("',")
				If bfColorPositive <> "blue" Then sx.Append("colorPositive:'" & bfColorPositive).Append("',")
				If bfDrawZeroLine <> False Then sx.Append("drawZeroLine:'true'").append(",")
				If bfMax <> -1 Then sx.Append("max:'" & bfMax).Append("',")
				If bfMin <> -1 Then sx.Append("min:'" & bfMin).Append("',")
				If bfShowValue = False Then sx.Append("showValue:'false'").Append(",")
				If bfWidth <> 100 Then sx.Append("bfWidth:'" & bfWidth & "'")
				Dim sbs As String: sbs = sx.ToString
				sbs = MvRemoveBlanks(sbs, ",")
				clsMPB.AppendLine("var " & varName & " = new google.visualization.BarFormat({" & sbs & "});")
			Else
				clsMPB.AppendLine("var " & varName & " = new google.visualization.BarFormat();")
			End If
			clsMPB.AppendLine("// Reformat " & fColumnName)
			clsMPB.AppendLine(varName & ".format(data, " & colPos & ");")
		End Select
	Next
	
	clsMPB.appendline("// Instantiate and draw our chart, passing in some options.")
	clsMPB.appendline("var chart = new google.visualization." & ChartType.Replace("Stacked","").Replace("Markers","").Replace("MapChart","Map") & "(document.getElementById('chart_div'));")
	If IsDataView = True Then
		clsMPB.AppendLine("var view = new google.visualization.DataView(data);")
		'clsMPB.AppendLine("view.setColumns([1]); // Create a view with the first column only.")
		clsMPB.appendline("chart.draw(view, options);")
	Else
		clsMPB.appendline("chart.draw(data, options);")
	End If
	clsMPB.appendline("}")
	#End Region 
	
	clsMPB.appendline("</script>")
  	clsMPB.appendline("</head>")
	clsMPB.appendline("<body>")
	clsMPB.appendline("<!--Div that will hold the pie chart-->")
	clsMPB.append("<div ")
	' render the property
	clsPB.Initialize 
	clsPB.AddProperty("id", "chart_div")
	clsPB.AddProperty("style","width:" & Width & "; height:" & Height) 
	clsMPB.append(clsPB.Render)
	clsMPB.append("></div>")
	clsMPB.appendline("</body>")
	clsMPB.appendline("</HTML>")
	HTML = clsMPB.renderlines
	If SaveToo = True Then File.WriteString(File.DirDefaultExternal, Title.Replace(":","_").Replace("?","_").Replace(">","_").Replace("<","_").Replace("/","_").Replace("\","_").Replace("|","_") & ".html", HTML)
	Log(HTML)
	WebView.LoadHtml(HTML)
End Sub

Sub BuildTimeLine() As String
	' process the columns
	Dim clsPB As clsPB
	Dim xy As Int = 0
	clsPB.Initialize
	clsPB.AppendLine("var data = new google.visualization.DataTable();")
	For i = 0 To FieldsAndTypes.Size - 1
		Dim field As String: field = FieldsAndTypes.GetKeyAt(i)
		Dim ftype As String: ftype = FieldsAndTypes.GetValueAt(i)
		If ftype = DT_Time Then ftype = DT_Date
		clsPB.AppendLine("data.addColumn({ type: '" & ftype & "', id: '" & field & "'});")
	Next
	clsPB.AppendLine("data.addRows([") 
	' process the rows
	Dim sb As StringBuilder
	sb.Initialize
	' loop through each row
	For i = 0 To mSeriesL.Size - 1
		If i > 0 Then sb.Append("," & CRLF)
		' get the row details
		Dim mRow As Map
		mRow.Initialize
		mRow = mSeriesL.Get(i) 
		sb.Append("[")
		' loop through each column
		For xy = 0 To FieldsAndTypes.Size - 1
			If xy > 0 Then sb.Append(", ")
			Dim field1 As String: field1 = FieldsAndTypes.GetKeyAt(xy)
			Dim ftype1 As String: ftype1 = FieldsAndTypes.GetValueAt(xy)
			Dim fValue As Object = mRow.Get(field1)
			If fValue = Null Then fValue = mseries.GetKeyAt(i)  
			Select Case ftype1
			Case DT_Number, DT_Date, DT_DateTime, DT_TimeOfDay, DT_Boolean, DT_Time
				sb.Append(fValue) 
			Case DT_String
				sb.Append("'" & fValue & "'") 
			End Select
		Next
		sb.Append("]")
	Next
	clsPB.Append(sb.ToString)
	clsPB.appendline("]);")
	Return clsPB.ToString
End Sub

Sub MapKeyPosition(m As Map, k As String) As Int
	Dim p As Int = -1
	For i = 0 To m.Size - 1
		Dim sk As String = m.GetKeyAt(i)
		If sk.ToLowerCase = k.ToLowerCase Then
			p = i
			Exit
		End If
	Next
	Return p
End Sub
