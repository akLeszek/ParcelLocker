# Parcel Locker

Application simulating the operation of a parcel locker, written in Java.

## About app

- Possibility to add, delete, display packages.
- Limiting the amount of available space in the parcel locker.
- Adding packages only with a specific code LLL-DDDD (L - letter, D- digit).


```java
parcelLocker.addPackage(new PackageA("POL-11111",1500)); // add Package with code "POL-11111" and weight "1500".
parcelLocker.listPackages(); // List all packages in parcel locker.
parcelLocker.numberOfParcel(); // Number of packages in parcel locker.
```