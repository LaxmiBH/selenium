set projectLocation=C:\Users\Admin\eclipse-workspace\Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLOcation%\lib\*
java org.testng.TestNG %projectLOcation%\testng.xml