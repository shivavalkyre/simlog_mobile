B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private Drawer As B4XDrawer
	Private CLVSidebar As CustomListView
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Label4 As Label
	Private Label5 As Label
	Private Label6 As Label
	Private Label7 As Label
	Private Label8 As Label
	Private Panel1 As Panel
	Private Panel2 As Panel
	Private Panel3 As Panel
	Private Panel4 As Panel
	Private Panel5 As Panel
	Private Panel6 As Panel
	Private Panel7 As Panel
	Private Panel8 As Panel
	Private ImageView1 As ImageView
	Private ImageView2 As ImageView
	Private ImageView3 As ImageView
	Private ImageView4 As ImageView
	Private ImageView5 As ImageView
	Private ImageView6 As ImageView
	Private ImageView7 As ImageView
	Private ImageView8 As ImageView
	Private Label12 As Label
	Private Label13 As Label
	Private Label14 As Label
	Private ImageView10 As ImageView
	Private ImageView11 As ImageView
	Private ImageView12 As ImageView
	Private scvDashboard As ScrollView
	Private txtSearchDashboard As EditText
	Private webChart As WebView
	Private clsGoogleChart As clsGoogleChart
	Private webChart1 As WebView
	Private PnlChartBONPermintaan As Panel
	Private clvBarangExisting As CustomListView
	Private PanelMainBarangExisting As Panel
	Private LabelNamaBarang As Label
	Private LabelKodeBarang As Label
	Private LabelKategoriBarang As Label
	Private LabelNilaiBarang As Label
	Private LabelTahunPengadaan As Label
	Private LabelSatuanBarang As Label
	Private LabelMerkBarang As Label
	Private PanelBottomMenu As Panel
	Private ImageViewBottomMenu3 As Label
	Private LabelKondisiBarang As Label
	Private LabelUsiaSimpanBarang As Label
	Private LabelStockMinimum As Label
	Private LabelStockBarang As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Drawer.Initialize(Me, "Drawer", Activity, 280dip)
	Drawer.CenterPanel.LoadLayout("LayoutMenu")
	Drawer.LeftPanel.LoadLayout("LayoutDrawer")
	Dim i As Int =0
	CLVSidebar.Add(CreateListItem(CLVSidebar.AsView.Width,CLVSidebar.AsView.Height),i)
	
	Panel1.Color=Colors.RGB(88,99,255)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home_white.png")
	Label1.TextColor=Colors.White
	
	scvDashboard.Panel.LoadLayout("LayoutISIDashboard")
	scvDashboard.panel.Height=PnlChartBONPermintaan.Top+PnlChartBONPermintaan.Height
	general.SetBackgroundTintList(txtSearchDashboard,Colors.White,Colors.White)
	clsGoogleChart.Initialize
	PanelMainBarangExisting.Visible=False
	AnyChart(clsGoogleChart.ChartTypeEnum.ColumnChart)
	FillDataBarang
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CreateListItem(Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, Height)
	p.LoadLayout("LayoutISISidebar")
	Return p
End Sub
'dashboard
Private Sub Label1_Click
	Panel1.Color=Colors.RGB(88,99,255)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home_white.png")
	Label1.TextColor=Colors.White
	
	Panel2.Color=Colors.RGB(152,159,254)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExisting.png")
	Label2.TextColor=Colors.Black
	
	Panel3.Color=Colors.RGB(152,159,254)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarang.png")
	Label3.TextColor=Colors.Black
	
	Panel4.Color=Colors.RGB(152,159,254)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarang.png")
	Label4.TextColor=Colors.black
	
	Panel5.Color=Colors.RGB(152,159,254)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatus.png")
	Label5.TextColor=Colors.black
	
	Panel6.Color=Colors.RGB(152,159,254)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasi.png")
	Label6.TextColor=Colors.Black
	
	Panel7.Color=Colors.RGB(152,159,254)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuser.png")
	Label7.TextColor=Colors.Black
	
	Panel8.Color=Colors.RGB(152,159,254)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografis.png")
	Label8.TextColor=Colors.black
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.Black
	
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	PanelMainBarangExisting.Visible=False
	scvDashboard.Visible=True
	
	Drawer.LeftOpen = False
	general.current_position =1
	
End Sub
'barang existing
Private Sub Label2_Click
	Panel1.Color=Colors.RGB(152,159,254)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home.png")
	Label1.TextColor=Colors.Black
	
	Panel2.Color=Colors.RGB(88,99,255)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExistingWhite.png")
	Label2.TextColor=Colors.White
	
	Panel3.Color=Colors.RGB(152,159,254)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarang.png")
	Label3.TextColor=Colors.Black
	
	Panel4.Color=Colors.RGB(152,159,254)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarang.png")
	Label4.TextColor=Colors.black
	
	Panel5.Color=Colors.RGB(152,159,254)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatus.png")
	Label5.TextColor=Colors.black
	
	Panel6.Color=Colors.RGB(152,159,254)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasi.png")
	Label6.TextColor=Colors.Black
	
	Panel7.Color=Colors.RGB(152,159,254)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuser.png")
	Label7.TextColor=Colors.Black
	
	Panel8.Color=Colors.RGB(152,159,254)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografis.png")
	Label8.TextColor=Colors.black
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.Black
	
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	PanelMainBarangExisting.Visible=True
	scvDashboard.Visible=False
	Drawer.LeftOpen = False
	general.current_position =2
End Sub

Private Sub Label3_Click
	Panel1.Color=Colors.RGB(152,159,254)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home.png")
	Label1.TextColor=Colors.Black
	
	Panel2.Color=Colors.RGB(152,159,254)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExisting.png")
	Label2.TextColor=Colors.Black
	
	Panel3.Color=Colors.RGB(88,99,255)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarangWhite.png")
	Label3.TextColor=Colors.white
	
	Panel4.Color=Colors.RGB(152,159,254)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarang.png")
	Label4.TextColor=Colors.black
	
	Panel5.Color=Colors.RGB(152,159,254)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatus.png")
	Label5.TextColor=Colors.black
	
	Panel6.Color=Colors.RGB(152,159,254)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasi.png")
	Label6.TextColor=Colors.Black
	
	Panel7.Color=Colors.RGB(152,159,254)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuser.png")
	Label7.TextColor=Colors.Black
	
	Panel8.Color=Colors.RGB(152,159,254)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografis.png")
	Label8.TextColor=Colors.black
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	Drawer.LeftOpen = False
End Sub


Private Sub Label4_Click
	Panel1.Color=Colors.RGB(152,159,254)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home.png")
	Label1.TextColor=Colors.Black
	
	Panel2.Color=Colors.RGB(152,159,254)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExisting.png")
	Label2.TextColor=Colors.Black
	
	Panel3.Color=Colors.RGB(152,159,254)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarang.png")
	Label3.TextColor=Colors.black
	
	Panel4.Color=Colors.RGB(88,99,255)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarangwhite.png")
	Label4.TextColor=Colors.white
	
	Panel5.Color=Colors.RGB(152,159,254)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatus.png")
	Label5.TextColor=Colors.black
	
	Panel6.Color=Colors.RGB(152,159,254)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasi.png")
	Label6.TextColor=Colors.Black
	
	Panel7.Color=Colors.RGB(152,159,254)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuser.png")
	Label7.TextColor=Colors.Black
	
	Panel8.Color=Colors.RGB(152,159,254)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografis.png")
	Label8.TextColor=Colors.black
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	Drawer.LeftOpen = False
	StartActivity(PengadaanBarang)
End Sub

Private Sub Label5_Click
	Panel1.Color=Colors.RGB(152,159,254)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home.png")
	Label1.TextColor=Colors.Black
	
	Panel2.Color=Colors.RGB(152,159,254)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExisting.png")
	Label2.TextColor=Colors.Black
	
	Panel3.Color=Colors.RGB(152,159,254)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarang.png")
	Label3.TextColor=Colors.black
	
	Panel4.Color=Colors.RGB(152,159,254)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarang.png")
	Label4.TextColor=Colors.black
	
	Panel5.Color=Colors.RGB(88,99,255)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatuswhite.png")
	Label5.TextColor=Colors.White
	
	Panel6.Color=Colors.RGB(152,159,254)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasi.png")
	Label6.TextColor=Colors.Black
	
	Panel7.Color=Colors.RGB(152,159,254)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuser.png")
	Label7.TextColor=Colors.Black
	
	Panel8.Color=Colors.RGB(152,159,254)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografis.png")
	Label8.TextColor=Colors.black
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	Drawer.LeftOpen = False
	StartActivity(TrackingStatus)
End Sub

Private Sub Label6_Click
	Panel1.Color=Colors.RGB(152,159,254)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home.png")
	Label1.TextColor=Colors.Black
	
	Panel2.Color=Colors.RGB(152,159,254)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExisting.png")
	Label2.TextColor=Colors.Black
	
	Panel3.Color=Colors.RGB(152,159,254)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarang.png")
	Label3.TextColor=Colors.black
	
	Panel4.Color=Colors.RGB(152,159,254)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarang.png")
	Label4.TextColor=Colors.black
	
	Panel5.Color=Colors.RGB(152,159,254)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatus.png")
	Label5.TextColor=Colors.Black
	
	Panel6.Color=Colors.RGB(88,99,255)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasiwhite.png")
	Label6.TextColor=Colors.white
	
	Panel7.Color=Colors.RGB(152,159,254)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuser.png")
	Label7.TextColor=Colors.Black
	
	Panel8.Color=Colors.RGB(152,159,254)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografis.png")
	Label8.TextColor=Colors.black
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	Drawer.LeftOpen = False
End Sub

Private Sub Label7_Click
	Panel1.Color=Colors.RGB(152,159,254)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home.png")
	Label1.TextColor=Colors.Black
	
	Panel2.Color=Colors.RGB(152,159,254)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExisting.png")
	Label2.TextColor=Colors.Black
	
	Panel3.Color=Colors.RGB(152,159,254)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarang.png")
	Label3.TextColor=Colors.black
	
	Panel4.Color=Colors.RGB(152,159,254)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarang.png")
	Label4.TextColor=Colors.black
	
	Panel5.Color=Colors.RGB(152,159,254)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatus.png")
	Label5.TextColor=Colors.Black
	
	Panel6.Color=Colors.RGB(152,159,254)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasi.png")
	Label6.TextColor=Colors.black
	
	Panel7.Color=Colors.RGB(88,99,255)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuserwhite.png")
	Label7.TextColor=Colors.white
	
	Panel8.Color=Colors.RGB(152,159,254)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografis.png")
	Label8.TextColor=Colors.black
	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	Drawer.LeftOpen = False
End Sub


Private Sub Label8_Click
	Panel1.Color=Colors.RGB(152,159,254)
	ImageView1.Bitmap = LoadBitmap(File.DirAssets,"home.png")
	Label1.TextColor=Colors.Black
	
	Panel2.Color=Colors.RGB(152,159,254)
	ImageView2.Bitmap = LoadBitmap(File.DirAssets,"BarangExisting.png")
	Label2.TextColor=Colors.Black
	
	Panel3.Color=Colors.RGB(152,159,254)
	ImageView3.Bitmap = LoadBitmap(File.DirAssets,"permintaanBarang.png")
	Label3.TextColor=Colors.black
	
	Panel4.Color=Colors.RGB(152,159,254)
	ImageView4.Bitmap = LoadBitmap(File.DirAssets,"pengadaanbarang.png")
	Label4.TextColor=Colors.black
	
	Panel5.Color=Colors.RGB(152,159,254)
	ImageView5.Bitmap = LoadBitmap(File.DirAssets,"trackingstatus.png")
	Label5.TextColor=Colors.Black
	
	Panel6.Color=Colors.RGB(152,159,254)
	ImageView6.Bitmap = LoadBitmap(File.DirAssets,"kodefikasi.png")
	Label6.TextColor=Colors.black
	
	Panel7.Color=Colors.RGB(152,159,254)
	ImageView7.Bitmap = LoadBitmap(File.DirAssets,"profileuser.png")
	Label7.TextColor=Colors.Black
	
	Panel8.Color=Colors.RGB(88,99,255)
	ImageView8.Bitmap = LoadBitmap(File.DirAssets,"infografiswhite.png")
	Label8.TextColor=Colors.white
	

	
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	Drawer.LeftOpen = False
End Sub

'sub menu ===========================================================
Private Sub Label12_Click
	Label3_Click
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventariswhite.png")
	Label12.TextColor=Colors.white
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	general.permintaan_barang_type=53
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	Drawer.LeftOpen = False
	StartActivity(PermintaanBarang)
End Sub

Private Sub Label13_Click
	Label3_Click
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventariswhite.png")
	Label13.TextColor=Colors.white
	
	general.permintaan_barang_type=52
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadang.png")
	'Label14.TextColor=Colors.black
	
	Drawer.LeftOpen = False
	StartActivity(PermintaanBarang)
	
End Sub

Private Sub Label14_Click
	Label3_Click
	ImageView10.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label12.TextColor=Colors.black
	
	ImageView11.Bitmap = LoadBitmap(File.DirAssets,"inventaris.png")
	Label13.TextColor=Colors.black
	
	'ImageView12.Bitmap = LoadBitmap(File.DirAssets,"sukucadangwhite.png")
	'Label14.TextColor=Colors.white
	
	Drawer.LeftOpen = False
End Sub
'============================================================================

'Dashboard chart ============================================================


Sub AnyChart(sChartType As String)
	clsGoogleChart.Initialize
	clsGoogleChart.Title = "Company Performance"
	clsGoogleChart.Width = 400
	clsGoogleChart.Height = 300
	clsGoogleChart.YAxis = "Year"
	clsGoogleChart.XAxis = "Values"
	
	' define the data table structure
	clsGoogleChart.AddColumn("Year", clsGoogleChart.DT_String)
	clsGoogleChart.AddColumn("Sales", clsGoogleChart.DT_Number)
	clsGoogleChart.AddColumn("Expenses", clsGoogleChart.DT_Number)
	clsGoogleChart.AddXYY("2004", "1000", "400")
	clsGoogleChart.AddXYY("2005", "1170", "460")
	clsGoogleChart.AddXYY("2006", "660", "1120")
	clsGoogleChart.addxyy("2007", "1030"," 540")
	
	clsGoogleChart.Legendposition = clsGoogleChart.LegendPositionEnum.Top
	clsGoogleChart.BackgroundColor = "white"
	clsGoogleChart.enableInteractivity = True
	clsGoogleChart.Animate = True
	clsGoogleChart.hAxisslantedText = True
	clsGoogleChart.hAxisslantedTextAngle = 90
	clsGoogleChart.SeriesColorsSet("Expenses", "pink")
	clsGoogleChart.SaveToo = True
	clsGoogleChart.isStacked = True
	clsGoogleChart.ChartType = sChartType
	clsGoogleChart.DrawChart(webChart)
End Sub

'=======================================================================


' Fill Data Barang Master ==============================================

Sub FillDataBarang
	For i = 0 To 10
		clvBarangExisting.Add(CreateListItemBarang(clvBarangExisting.AsView.Width,clvBarangExisting.AsView.Height,"nama barang" & i ,"kd barang" & i, "kategori_barang " & i, "tahun pengadaan " & i , "nilai " & i,"satuan " & i,"merk " &i , "kondisi " & i,"usia simpan " & i ,"10","10"),i)
	Next
End Sub


Sub CreateListItemBarang(Width As Int, Height As Int,nama_barang As String,kd_barang As String,kategori_barang As String,tahun_pengadaan As String,nilai_barang As String,satuan As String,merk As String,kondisi As String,usia_simpan As String,stock_minimum As String,stock As String) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, 400dip)
	p.LoadLayout("LayoutISICLVBarangExisting")
	LabelNamaBarang.Text = nama_barang
	LabelKodeBarang.Text = kd_barang
	LabelKategoriBarang.Text=kategori_barang
	LabelTahunPengadaan.Text=tahun_pengadaan
	LabelNilaiBarang.Text= nilai_barang
	LabelSatuanBarang.Text = satuan
	LabelMerkBarang.Text = merk
	LabelKondisiBarang.Text= kondisi
	LabelUsiaSimpanBarang.Text = usia_simpan
	LabelStockMinimum.Text=stock_minimum
	LabelStockBarang.Text = stock
	'lblNamaAton.Text= nama_aton
	'lblKodeMensu.Text= kd_aton
	'lblOperatorMensu.Text=  operator
	'lblBarang.Text=nama_barang
	'lblEdit.Tag=id
	'lblDelete.Tag=id
	'lblBarang.Tag=id
	Return p
End Sub






Private Sub ImageViewBottomMenu3_Click
	'add by current position
	If general.current_position=2 Then
		StartActivity(NewBarangExisting)
	End If
End Sub