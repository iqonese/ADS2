# ADS2
## MyArrayList
### ArrayList data structure allows us to dynamically change and modify the array content. It is very useful when working with unstable and unpredictable data\n
```
public void increaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length*2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }
```
The logic behind dynamically altering the size of the array is to expand its size to factor of 2 rather that constantly incrementing by unit.
