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

	Private txtusername As EditText
	Private txtEmail As EditText
	Private txtPassword As EditText
	Private txtRePassword As EditText
	Private Label7 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Register")
	general.SetBackgroundTintList(txtusername,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtEmail,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtPassword,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtRePassword,Colors.White,Colors.White)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Label7_Click
	
	StartActivity(Login)
	Activity.Finish
End Sub