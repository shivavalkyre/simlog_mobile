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
	Dim ba As Bitmap= LoadBitmap(File.DirAssets,"ba.png")
	Dim checked As Bitmap= LoadBitmap(File.DirAssets,"checked.png")
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private tl As TimeLineView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	tl.Initialize("tl")
	Activity.AddView(tl,0,0,100%x,100%y)
	tl.addStep(1 ,DateTime.Now,"One step","This is first step", ba, Colors.RGB(95,158,160),1dip, 50dip, -1,10dip)
	tl.addStep(2 ,DateTime.Now,"Two step","This is second step",ba,Colors.RGB(95,158,160),1dip,50dip,-1,10dip )
	tl.addStep(2 ,DateTime.Now,"Third step","This is third step",ba,Colors.RGB(95,158,160),1dip,50dip,-1,10dip )
	tl.addStep(2 ,DateTime.Now,"Fourth step","This is bla bla step",ba,Colors.RGB(95,158,160),1dip,50dip,-1,10dip )
	tl.addStep(2 ,DateTime.Now,"5th step","This is bla bla step",ba,Colors.RGB(95,158,160),1dip,50dip,-1,10dip )
	tl.addStep(2 ,DateTime.Now,"6th step","This is bla bla step",ba,Colors.RGB(95,158,160),1dip,50dip,-1,10dip )
	tl.addStep(2 ,DateTime.Now,"7th step","This is bla bla step",ba,Colors.RGB(95,158,160),1dip,50dip,-1,10dip )
	tl.addStep(2 ,DateTime.Now,"8th step","This is bla bla step",ba,Colors.RGB(95,158,160),1dip,50dip,-1,10dip )

	tl.build(False)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub tl_click(tlr As TimeLineRow,position As Int,id As Long)
	tlr.Description="Modified"&id
	tlr.Image=checked
	tlr.Date=DateTime.Now
	'not sure it is a good practice to call notifyDataSetChanged here
	tl.notifyDataSetChanged
End Sub

