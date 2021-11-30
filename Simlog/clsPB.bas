Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=2.71
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private m As Map
	Private sb As StringBuilder
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	m.Initialize 
	sb.Initialize 
End Sub

Public Sub AddProperty(sKey As String, sValue As String)
	m.Put(sKey, sValue)
End Sub

Public Sub Render() As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To m.Size - 1
		If i > 0 Then sb.Append(" ")
		sb.Append(m.GetKeyAt(i)).Append("=").Append(QUOTE).Append(m.GetValueAt(i)).Append(QUOTE)  
	Next
	Return sb.ToString
End Sub


Public Sub AppendLine(sLine As String)
	sb.Append(sLine).Append(CRLF)
End Sub

Public Sub Append(sLine As String)
	sb.Append(sLine)
End Sub

Public Sub ToString() As String
	Return sb.ToString
End Sub

Public Sub RenderLines() As String
	Return sb.ToString
End Sub