@echo off
setlocal enabledelayedexpansion

:: Prompt the user for assignment number, ID, and name
set /p assignmentNumber=Enter the assignment number (e.g., 01): 
set /p userID=Enter your ID: 
set /p userName=Enter your name: 

:: Create the output file name
set outputFile=Assignment %assignmentNumber%_%userID%_%userName%.txt
echo. > "%outputFile%"

:: Loop through all files in the current directory
for %%f in (task*.java) do (
    set fileName=%%~nf
    set fileNumber=!fileName:~4,2!
    
    :: Check if the file number is between 01 and 99
    if !fileNumber! geq 01 if !fileNumber! leq 99 (
        echo //task!fileNumber! >> "%outputFile%"
        type %%f >> "%outputFile%"
        echo. >> "%outputFile%"
    )
)

echo Done! The output is saved in "%outputFile%".
pause
