@echo off
setlocal enabledelayedexpansion

:: Display the warning message
echo HEY YOU!
echo YES YOU!
echo WATCH THIS WITH YOUR EYES!
echo BEFORE YOU USE THIS SCRIPT, 
echo MAKE SURE TO NAME YOUR JAVA FILES IN task##.java FORMAT WHERE ## MEANS 01 to 99 (ANSWERS IN SERIAL)
echo OTHERWISE IT WONT WORK
echo also put this script file inside the folder where you kept your assignments together
echo Thank you
pause
cls

:: Prompt the user for assignment number, ID, and name
set /p assignmentNumber=Enter the assignment number (e.g., 01): 
if "%assignmentNumber%"=="" (
    echo Assignment number cannot be empty. Exiting...
    pause
    exit /b
)
set /p userID=Enter your ID: 
if "%userID%"=="" (
    echo User ID cannot be empty. Exiting...
    pause
    exit /b
)
set /p userName=Enter your name: 
if "%userName%"=="" (
    echo Name cannot be empty. Exiting...
    pause
    exit /b
)

:: Create the output file name
set outputFile=Assignment %assignmentNumber%_%userID%_%userName%.txt

:: Clear or create the output file
> "%outputFile%" echo. 

:: Notify user that output file creation is in progress
echo Generating output file: %outputFile%

:: Loop through all files in the current directory
set fileFound=0
for %%f in (task*.java) do (
    set "fileName=%%~nf"
    set "fileNumber=!fileName:~4,2!"
    
    :: Validate fileNumber as a numeric value between 01 and 99
    if "!fileNumber!" geq "01" if "!fileNumber!" leq "99" (
        set /a fileFound=1
        echo //task!fileNumber! >> "%outputFile%"
        type "%%f" >> "%outputFile%"
        echo. >> "%outputFile%"
    )
)

:: Check if any valid files were found
if "!fileFound!"=="0" (
    echo No valid task##.java files found in the current directory.
    del "%outputFile%"
    pause
    exit /b
)

echo Done! The output is saved in "%outputFile%".
pause
