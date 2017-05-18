## How to run this test
1. Clone the repository.
2. Select `build.gradle` file from the project and open it as a project.
3. There are two options for running your tests -
   1.  Go to your IntelliJ terminal and type the following -

     ` gradle clean build runFragmentation -DtestFeed="swiggy" -Dtags=@restaurant-selection`

    Here you can choose to replace the tags in the feature
    files which you will find under `src/test/resources`

   2.  The other option is to go to Run->Edit Configurations from your menu and
     click on it.Then click on Defaults->Cucumber java.You will see a configuration
     tab on the top right side.Under that you will find VM options.There you have
     to write the following :

     `-DtestFeed=swiggy -DrunMode=Fragmentation`

     After doing this, go to any of the feature files and right click on any
     scenario and select Run option.
     
###  No more updates about Optimus in this Wiki.
