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

	Private clvTable As CustomListView
	Private lblNo As Label
	Private lblKategori As Label
	Private lblKode As Label
	Private lblNamaBarang As Label
	Private lblJumlah As Label
	Private txtCariBarang As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	If general.permintaan_barang_type=53 Then
		Activity.LoadLayout("ListPermintaanBarangInventaris")
		general.SetBackgroundTintList(txtCariBarang,Colors.White,Colors.White)
		For i=0 To 10
			clvTable.Add(CreateListItemBarangPermintaan(clvTable.AsView.Width,180dip,i,"kategori "& i,"kode "& i ,"nama barang " & i , i),i)
		Next
	Else
		
	End If

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CreateListItemBarangPermintaan(Width As Int, Height As Int,nomor As String,kategori As String,kode As String,nama_barang As String,jumlah As String) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, Height)
	p.LoadLayout("LayoutisiTablePermintaan")
	'lblNo.Text=nomor
	lblKategori.Text= kategori
	lblKode.Text= kode
	lblNamaBarang.Text= nama_barang
	lblJumlah.Text = jumlah
	Return p
End Sub