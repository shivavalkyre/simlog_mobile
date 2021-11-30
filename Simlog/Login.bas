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
	Private txtPassword As EditText
	Private Button1 As Button
	Private Label5 As Label
	Private url_login As String ="http://insaf.disnavpriok.id:3000/api/users/insaf/login"
	Private Label4 As Label
	Private lblErrorMessage As Label
	Private PanelErrorPopup As Panel
	Private Label7 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Layout")
	general.SetBackgroundTintList(txtusername,Colors.white,Colors.White)
	general.SetBackgroundTintList(txtPassword,Colors.white,Colors.White)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Button1_Click
	'xui.MsgboxAsync("Hello world!", "B4X")
	If txtusername.Text.Length>0 And txtPassword.Text.Length>0 Then
		Dim j As HttpJob
		Dim parameter As String ="username="&txtusername.Text&"&password=" & txtPassword.Text
		j.Initialize("j",Me)
		Log(url_login)
		j.PostString (url_login,parameter)
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
			Log(j.GetString)
			Dim result As String = j.GetString
			Dim parser As JSONParser
			parser.Initialize(result)
			Dim root As Map = parser.NextObject
			Dim level As Int = root.Get("level")
			Dim id As String = root.Get("id")
			Dim token As String = root.Get("token")
			Dim username As String = root.Get("username")
			StartActivity(Home)
			Activity.Finish
		Else
			PanelErrorPopup.Color = Colors.ARGB(255,232,78,39)
			PanelErrorPopup.SetVisibleAnimated(500,True)
			lblErrorMessage.Text="Cannot find user"
		End If
		j.Release
	End If
End Sub


Private Sub Label5_Click
	StartActivity(Register)
	Activity.Finish
End Sub


Private Sub Label4_Click
	StartActivity(ForgotPasswoord)
	Activity.Finish
End Sub

Private Sub Label7_Click
	PanelErrorPopup.SetVisibleAnimated(500,False)
End Sub