@echo off
setlocal EnableExtensions EnableDelayedExpansion


REM ==============================
REM ===== Expected Hash Values ===
REM ==============================

set "HASH[1]=8f1d7ef3e5faa056e7045851b95b62328cc73123249e88fa40d89e75e232a1b4"
set "HASH[2]=4c6f17682454bf54972dc938f7328c2e6c3bb0fe2cbd1fc56b34c44eaee1d2be"
set "HASH[3]=f060f554df9a0617d5fb010194f25a6f77830b5066a7610538abf1df845ba043"
set "HASH[4]=662d316960e8c879de3e405b9c537a73520171434d2d89f6ea87cf62286b5583"
set "HASH[5]=bea62272047e752cd42be1da6758d891ee62be145b48c74949bb4af580ed5294"
set "HASH[6]=8c42267df447ef36ec669de8bacaa09037aad5473d1f9968cf213cc0d9f7ba50"
set "HASH[7]=bea62272047e752cd42be1da6758d891ee62be145b48c74949bb4af580ed5294"




set "NUM_TEST=7"

echo.
javac Solution.java  2>&1

if errorlevel 1 (
    echo Compilation Failed.
    pause
    exit /b 1
)

for /l %%i in (1,1,%NUM_TEST%) do (
    echo Running on Test Case - %%i

    java Solution < inp%%i.txt > out%%i.txt 2>nul

    set "hash="

    for /f "skip=1 tokens=* delims=" %%H in ('certutil -hashfile out%%i.txt SHA256') do (
        if not defined hash set "hash=%%H"
    )

    set "hash=!hash: =!"

    if /i "!hash!"=="!HASH[%%i]!" (
        echo Verdict: Accepted
    ) else (
        echo Verdict: Wrong Answer
    )

    echo.
)

pause
exit /b 0