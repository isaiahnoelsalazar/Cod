# How to import Cod
- Add JitPack in settings.gradle
```
dependencyResolutionManagement {
    /* other existing code */
    repositories {
        /* other existing code */
        maven { url 'https://jitpack.io' }
    }
}
```
- Add dependency in build.gradle
```
implementation 'com.github.saiaaaaaaa:Cod:(version)'
```
- Import the dependency
```
import com.github.saiaaaaaaa.cod.normal.EasySQL;
import com.github.saiaaaaaaa.cod.normal.Fullscreen;
```
# How to use Cod
## 1. EasySQL
- Initialize EasySQL using context
```
EasySQL easySQL = new EasySQL(context);
```
### Methods
> EasySQL will automatically create/open a database while calling any methods
- Create a table
```
easySQL.createTable("sampledb", "sampletable", new String[]{"firstname:text", "lastname:text"});
```
- Insert a value to a table
```
easySQL.insertToTable("sampledb", "sampletable", new String[]{"firstname:FirstNameSaia", "lastname:LastNameSaia"});
```
- Get all values from a table
```
for (String s : easySQL.getTableValues("sampledb", "sampletable")){
    System.out.println(s);
}
```
- Check if a table exists
```
if (easySQL.doesTableExist("sampledb", "sampletable")){
    /* other existing code */
}
```
- Delete a table
```
easySQL.deleteTable("sampledb", "sampletable");
```
- Delete a value from a table
```
easySQL.deleteFromTable("sampledb", "sampletable", "firstname:FirstNameSaia");
```
> The method 'deleteFromTable' will delete the whole row with a matching columnValuePair
- Clear all values from a table
```
easySQL.clearTable("sampledb", "sampletable");
```
## 2. Fullscreen
> Keyword 'this' refers to any valid activity
- Enable fullscreen on any activity
```
Fullscreen.enable(this);
```
- Disable fullscreen on any activity
```
Fullscreen.disable(this);
```
