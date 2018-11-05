

# PrefUtil
 Android library  for managing  shared preferences.

# Usage

 Add dependency to the build.gradle file in the app module:

```java
implementation 'tr.org.omary.util:prefutil:0.0.1'
```


initialize the PrefUtil  inside your application class :

```java
  PrefUtil prefUtil = PrefUtil.Init(this);
```

```java
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         PrefUtil prefUtil = PrefUtil.Init(this);
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
prefUtil.getString(Key);    /*For String value */   OUTPUT: TEST

prefUtil.getBoolean(Key);  /*For Boolean value */   OUTPUT: true

prefUtil.getInt(Key);      /*For Int value */    OUTPUT: 12345

prefUtil.getFloat(Key);    /*For Float value */  OUTPUT: 12345

prefUtil.getLong(Key);    /*For Long value */   OUTPUT: 12345


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
