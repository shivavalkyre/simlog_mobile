B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ScrollView1 As ScrollView
	Private EditText1 As EditText
	Private EditText2 As EditText
	Private EditText3 As EditText
	Private EditText4 As EditText
	Private EditText5 As EditText
	Private EditText6 As EditText
	Private EditText7 As EditText
	Private EditText8 As EditText
	Private EditText9 As EditText
	Private EditText10 As EditText
	Private EditText11 As EditText
	Private EditText12 As EditText
	Private Button2 As Button
	Private Button1 As Button
	Private ListView1 As ListView
	Private LabelList1 As Label
	Private Panel1 As Panel
	Private LabelListState As Int
	Private InventarisState As Int
	Private LabelList3 As Label
	Private Panel8 As Panel
	Private LabelList4 As Label
	Private Panel2 As Panel
	Private ScrollView2D1 As ScrollView2D
	Private Panel14 As Panel
	Private sweet As SweetAlertDialog
	Private Button3 As Button
	Private LabelMessageClose As Label
	Private PanelLock As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("LayoutScvNewBarang")
	ScrollView1.Panel.LoadLayout("LayoutNewBarang")
	ScrollView1.Panel.Height= Button1.Top+Button1.Height+10dip
	'sweet.Initialize("Alert")
	'ScrollView2D1.Panel.LoadLayout("LayoutNewBarang")
	'ScrollView2D1.Panel.Height = Button1.Top+Button1.Height+10dip
	
	general.SetBackgroundTintList(EditText1,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText2,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText3,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText4,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText5,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText6,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText7,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText8,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText9,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText10,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText11,Colors.White,Colors.White)
	general.SetBackgroundTintList(EditText12,Colors.White,Colors.White)
End Sub

Sub Activity_Resume
	'sweet.showCancelButton(True).showContentText(True).withCancelText("Not yet").withConfirmText("Yo man").withContentText("Bla bla bla bla").withTitleText("DonManfred present").show
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub LabelList1_Click
	'ScrollView2D1.DisableTouchEventInterception(True)
	Dim r As Reflector
	r.Target = ScrollView1
	r.RunMethod2("setVerticalScrollBarEnabled", False, "java.lang.boolean")
	r.RunMethod2("setOverScrollMode", 2, "java.lang.int" )
	
		
	Dim gd As GradientDrawable
	gd.Initialize("BOTTOM_TOP", Array As Int (Colors.White, Colors.white, Colors.White))
	ListView1.Clear
	ListView1.AddSingleLine("Inventaris")
	ListView1.AddSingleLine("Persediaan")
	ListView1.Height=100dip
	ListView1.Top=Panel1.Top+Panel1.Height
	ListView1.BringToFront
	ListView1.SingleLineLayout.Background = gd
	ListView1.SingleLineLayout.Label.TextColor= Colors.Black
	ListView1.SingleLineLayout.Label.TextSize=12
	ListView1.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("poppins-regular.ttf")
	InventarisState=0
	
	If LabelListState =0 Then
		ListView1.SetVisibleAnimated(200,True)
		LabelListState=1
	Else
		ListView1.SetVisibleAnimated(200,False)
		LabelListState=0
	End If
End Sub

Private Sub ListView1_ItemClick (Position As Int, Value As Object)
	Select Case Value
		Case "Inventaris"
			If InventarisState=0 Then
				EditText1.Text=Value
				EditText2.Text=""
				EditText2.RequestFocus
			else if InventarisState=1 Then
				EditText2.Text=Value
				EditText3.RequestFocus
			End If 
			'MsgboxAsync(Value,"Simlog")
		Case "Persediaan"
			EditText1.Text=Value
			EditText2.Text=""
			EditText2.RequestFocus
			'MsgboxAsync(Value,"Simlog")
		Case "Baik"
			EditText8.Text=Value
			'MsgboxAsync(Value,"Simlog")
		Case "Rusak Ringan"
			EditText8.Text=Value
			'MsgboxAsync(Value,"Simlog")
		Case "Rusak Berat"
			EditText8.Text=Value
		Case "Suku Cadang"
			EditText2.Text =Value
		Case "Bahan Baku"
			EditText2.Text =Value
		Case "Konsumsi"
			EditText2.Text =Value
		Case "Pemeliharaan"
			EditText2.Text =Value
		Case "Barang Lainnya"
			EditText2.Text =Value
		Case "Bahan Berjaga-Jaga"
			EditText2.Text =Value
		
	End Select
	MsgboxAsync(Value,"Simlog")
	LabelListState=0
	
	ListView1.SetVisibleAnimated(200,False)
End Sub

Private Sub LabelList3_Click
	'ScrollView2D1.DisableTouchEventInterception(True)
	Dim r As Reflector
	r.Target = ScrollView1
	r.RunMethod2("setVerticalScrollBarEnabled", False, "java.lang.boolean")
	
	Dim gd As GradientDrawable
	gd.Initialize("BOTTOM_TOP", Array As Int (Colors.White, Colors.white, Colors.White))
	ListView1.Clear
	ListView1.AddSingleLine("Baik")
	ListView1.AddSingleLine("Rusak Ringan")
	ListView1.AddSingleLine("Rusak Berat")
	ListView1.Height=150dip
	ListView1.Top=Panel8.Top+Panel8.Height
	ListView1.BringToFront
	ListView1.SingleLineLayout.Background = gd
	ListView1.SingleLineLayout.Label.TextColor= Colors.Black
	ListView1.SingleLineLayout.Label.TextSize=12
	ListView1.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("poppins-regular.ttf")

	If LabelListState =0 Then
		ListView1.SetVisibleAnimated(200,True)
		LabelListState=1
	Else
		ListView1.SetVisibleAnimated(200,False)
		LabelListState=0
	End If
	
End Sub

Private Sub LabelList4_Click
	'ScrollView2D1.DisableTouchEventInterception(True)
	Dim r As Reflector
	r.Target = ScrollView1
	r.RunMethod2("setVerticalScrollBarEnabled", False, "java.lang.boolean")
	r.RunMethod2("setOverScrollMode", 2, "java.lang.int" )
	ScrollView1.Enabled =False
	
	Dim gd As GradientDrawable
	gd.Initialize("BOTTOM_TOP", Array As Int (Colors.White, Colors.white, Colors.White))
	ListView1.Clear
	If EditText1.Text="Persediaan" Then
		ListView1.AddSingleLine("Suku Cadang")
		ListView1.AddSingleLine("Bahan Baku")
		ListView1.AddSingleLine("Konsumsi")
		ListView1.AddSingleLine("Pemeliharaan")
		ListView1.AddSingleLine("Barang Lainnya")
		ListView1.AddSingleLine("Bahan Berjaga-Jaga")
		ListView1.RequestFocus
		ListView1.Height=250dip
		ListView1.Top=Panel2.Top+Panel2.Height
		ListView1.BringToFront
		ListView1.SingleLineLayout.Background = gd
		ListView1.SingleLineLayout.Label.TextColor= Colors.Black
		ListView1.SingleLineLayout.Label.TextSize=12
		ListView1.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("poppins-regular.ttf")
		
	Else if EditText1.Text="Inventaris" Then
		ListView1.AddSingleLine("Inventaris")
		ListView1.RequestFocus
		ListView1.Height=40dip
		ListView1.Top=Panel2.Top+Panel2.Height
		ListView1.BringToFront
		ListView1.SingleLineLayout.Background = gd
		ListView1.SingleLineLayout.Label.TextColor= Colors.Black
		ListView1.SingleLineLayout.Label.TextSize=12
		ListView1.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("poppins-regular.ttf")
		InventarisState=1
	Else
		'ListView1.Visible=False
		LabelListState=1
		MsgboxAsync("Pilih Kode Parent", "Simlog")
	End If
	

	If LabelListState =0 Then
		ListView1.SetVisibleAnimated(200,True)
		LabelListState=1
	Else
		ListView1.SetVisibleAnimated(200,False)
		LabelListState=0
	End If
End Sub

Private Sub Button1_Click
	'sweet.Initialize("Alert")
	'sweet.AlertType = sweet.TypeSuccess
	'sweet.showCancelButton(False).showContentText(True).withConfirmText("OK").withContentText("Tambah Data Barang").withTitleText("Sukses").show
Panel14.Top=50%y-Panel14.Height/2
Panel14.SetVisibleAnimated(300,True)
PanelLock.Visible=True
ScrollView1.Enabled=False
ScrollView1.Panel.Enabled=False
ScrollView1.Panel.RemoveAllViews
ScrollView1.ScrollPosition=0
End Sub

'Sub Alert_onCancel()
'	Log($"Alert_onCancel()"$)
'	sweet.AlertType = sweet.TypeError
'	'sweet.withContentText("BLA bla BLA bla BLA")
'	sweet.dismissWithAnimation
'End Sub
'Sub Alert_onConfirm()
'	Log($"Alert_onConfirm()"$)
	
'	sweet.dismissWithAnimation
'End Sub

'Sub Alert_onDismiss()
'	Log($"Alert_onConfirm()"$)
'	sweet.dismissWithAnimation
'End Sub

'Sub Activity_Click
	
'End Sub

Private Sub Button3_Click
	PanelLock.Visible=False
	Panel14.SetVisibleAnimated(200,False)
	Activity.Finish
End Sub

Private Sub LabelMessageClose_Click
	PanelLock.Visible=False
	Panel14.SetVisibleAnimated(200,False)
	Activity.Finish
End Sub