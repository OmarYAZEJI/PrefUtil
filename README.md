# PrefUtil
Android Library for working with shared preferences in Android Studio.

# Usage

 Add dependency:

```java
compile 'tr.org.omary.util:prefutil:0.0.1'
```


initialize the PrefUtil  inside your application class :

```java
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PrefUtil prefUtil = PrefUtil.Init(this);
    }
```


## Saving Values
```java
 prefUtil.save(Key,Value); //prefUtil.save("Name","TEST") for string value
                          //prefUtil.save("Number",12345) for int, long, float
                          //prefUtil.save("IsLogged",true) for boolean
                          
```
