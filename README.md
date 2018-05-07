# PrefUtil
Android Library for working with shared preferences in Android Studio.

# Usage

 Add dependency:

```java
compile 'tr.org.omary.util:prefutil:0.0.1'
```


initialize the PrefUtil  inside your application class :

```java
 final PrefUtil prefUtil = PrefUtil.Init(this);
```

```java
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PrefUtil prefUtil = PrefUtil.Init(this);
    }
```


### Saving Values
```java
 prefUtil.save(Key,Value);
```
```java
 /**
 *  prefUtil.save("Name","TEST") for string value
 *  prefUtil.save("Number",12345) for int, long, float 
 *  prefUtil.save("IsLogged",true) for boolean
 *
 */                      
```

### Getting Values
```java
prefUtil.getString(Key);    /*For String value */

prefUtil.getBoolean(Key);  /*For Boolean value */

prefUtil.getInt(Key);      /*For Int value */

prefUtil.getFloat(Key);    /*For Float value */

prefUtil.getLong(Key);    /*For Long value */

```

```java
 /**
 *  prefUtil.getString("Name")          return TEST
 *  prefUtil.getBoolean("IsLogged")     return true
 *  prefUtil.getInt("Number")           return 12345
 *
 */                      
```

### Remove Value
```java
prefUtil.removeValue(Key);                
```
```java
 /**
 * prefUtil.removeValue("Name");   
 */  
```

### Clear All Values
```java
prefUtil.clearALl();                
```
