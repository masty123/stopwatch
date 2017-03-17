## Stopwatch task by Theeruth Borisuth.

Task	Time :
The result of this program running on my HP OMEN 16, and got
these results:
| Type of testing | Total time |
|:----------------|-----------:|
|Append 50,000 chars to String|0.716821 sec|

|Append 100,000 chars to String|2.137186 sec|

|Append 100,000 chars to StringBuilder|0.002015 sec|

|Add 1 billion double primitives using array|1.472837 sec|

|Add 1 billion double objects using array|4.552700 sec|

|Add 1 billion BigDecimal using array|8.116959 sec|

## Explanation of Results


-Appending StringBuilder is faster than appending String because appending String need to create the entirely new string object.


-Double is faster than Double object and BigDecimal because it is 
primitivevariable but Double object and BigDecimal are objects.

-BigDecimal requires more memory so it's perform the slowest task.
