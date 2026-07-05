@echo off
setlocal EnableExtensions EnableDelayedExpansion


REM ==============================
REM ===== Expected Hash Values ===
REM ==============================

set "HASH[1]=86e7992d7e710ae3c6fca5ca8cbcb9e5c553d457eb6afe6c71649966e402579d"
set "HASH[2]=9f68bd88da04539824ad81ce6350a89b103984b5fbba43c1dd5819012761f57a"
set "HASH[3]=e483ee74dc7f6b2ac281b3d6fab365b787b2f3c22947287e87e3d6466b874286"
set "HASH[4]=8c590c536af6d9357195874ed6b76933cdfaa95a670aaabae71f49271f3b0383"
set "HASH[5]=a322c707610b9e51d7382c754a67e41e184a7fedaba4aaf9436dc7bad2ebfba5"
set "HASH[6]=de05cd2800234274c6a0cbeef9d0ad9c755d419fe1b17b2f4517eee9512fd968"
set "HASH[7]=c42297487f599f19b6f3f8286afe53918ed5cd6a039ca64804e4ad3279835ae1"




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