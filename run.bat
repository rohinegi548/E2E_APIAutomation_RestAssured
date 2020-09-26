@ECHO OFF
ECHO: & ^
ECHO Please wait... Maven is Generating some beautiful HTML Reports  & ^
ECHO: & ^
mvn allure:report  & ^
ECHO: & ^
ECHO -----------------------------------------Beautiful HTML Reports have been generated successfully.-----------------------------------------  & ^
ECHO: & ^
ECHO -----------------------------------------Listing out genrated HTML Reports in system default browswer----------------------------------------- & ^
ECHO: & ^
allure open reports & ^
ECHO: & ^
ECHO -----------------------------------------Server stopped----------------------------------------- & ^
PAUSE