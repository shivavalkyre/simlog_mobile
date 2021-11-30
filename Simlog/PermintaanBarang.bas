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

	Private clvInventaris As CustomListView
	Private LblNoDokumen As Label
	Private LblTglPermintaan As Label
	Private LblUserYgMeminta As Label
	Private LblPerihal As Label
	Private LblTujuan As Label
	Private Button1 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	If general.permintaan_barang_type=53 Then
		Activity.LoadLayout("Permintaan_Inventaris")
		'Dim i As Int =0
		For i=0 To 10
			clvInventaris.Add(CreateListItemPermintaan(clvInventaris.AsView.Width,340dip,"no_dokumen "& i,"tgl_dokumen " & i,"yg memninta " & i,"perihal " & i , "tujuan " & i,i),i)
		Next
	Else
		Activity.LoadLayout("Permintaan_Inventaris")
		'Dim i As Int =0
		For i=0 To 10
			clvInventaris.Add(CreateListItemPermintaan(clvInventaris.AsView.Width,340dip,"no_dokumen "& i,"tgl_dokumen " & i,"yg memninta " & i,"perihal " & i , "tujuan " & i,i),i)
		Next
	End If
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CreateListItemPermintaan(Width As Int, Height As Int,no_dokumen As String,tgl_dokumen As String,yg_meminta As String,perihal As String,tujuan As String,i As Int) As Panel
Dim p As Panel
p.Initialize("")
p.SetLayout(0, 0, Width, Height)
p.LoadLayout("LayoutisiListPermintaanBarang")
LblNoDokumen.Text= no_dokumen
LblTglPermintaan.Text= tgl_dokumen
LblUserYgMeminta.Text=yg_meminta
LblPerihal.Text=perihal
LblTujuan.Text= tujuan
Button1.Tag=i
p.Elevation=10dip
Return p
End Sub

Private Sub Button1_Click
	Dim send As Button
	send.Initialize("send")
	send = Sender
	StartActivity(ListPermintaanBarang)
End Sub