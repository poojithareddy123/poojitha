set projectLocation=D:\MyJavaPrograms\Batch -003 FrameWork
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml