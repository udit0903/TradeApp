# TradeApp

## Prerequisite
* Java Project <br/>
* Eclipse IDE : Oxygen <br/>
* Java Version Used: JDK 1.8,JRE 1.8 <br/>
* Juint Version Used : JUnit 5 <br/>

## Steps to run the code
* Downlaod the repo. <br/>
* Import the Java Project. <br/>
*  Right click on project->properties->java Build Path->libraries->Add libraries -> Select JUnit 5-> Select Junit5. <br/>


## Steps to execute the code
* Execute tradeTestRunner.java with Junit Test. <br/>
* Excute tradeTransmissionMain.java. <br/>

## Tested
### Cheaked if
* 1st Trade is added. <br/>
* Version is high the list will be updated. <br/>
* Version is same the list will be updated. (override) <br/>
* Version is low the trade will be rejected. <br/>
* Maturity Date is greater than todays date the trade is added. <br/>
* Maturity Date is lower than todays date the Trade will not be added. <br/>
* Version is Same and date is lower the trade is not updated. <br/>
* Maturity Date is Same as Todays Date the list will be added. <br/>
* Version is high but maturity date is low the trade will be rejected. <br/>
* Maturity Date is Expired (Maturity Date < Today Date ) it will update the Expired Flag= 'Y'. <br/>

