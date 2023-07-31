1. StringBuffer(): It creates an empty string buffer and reserves space for 16 
characters.
2. StringBuffer(int size): It creates an empty string and takes an integer 
argument to set capacity of the buffer.
3. StringBuffer(String str): It creates a stringbuffer object from the specified 
string.
4. StringBuffer(char []ch): It creates a stringbuffer object from the 
charsequence array


StringBuffer append(T value)
StringBuffer insert(int index, T value)
StringBuffer delete (int start, int end)
StringBuffer deleteCharAt (int index)
StringBuffer replace (int start, int end, String newString)
StringBuffer reverse()


String ==>
1. Characters of String cannot be changed.
2. String is immutable. 
3. Processing of String is slow
4. At the time of String concatenation, String consumes more memory space.


StringBuffer ==>
1. Characters of StringBuffer can be changed.
2. StringBuffer is mutable.
3. Processing of StringBuffer is fast.
4. At the time of String concatenation, StringBuffer consumes less memory space




Difference Betweeen string and stringbuffer
1.once we creates a string object we can't perform any changes in the existing object.
if we are trying to perform any changes with those changes a new object will be created.
This non changeable nature is nothing but immutability of the string object.

2. Once we creates a StringBuffer object we can perform any type of changes in the existing
object. this changeable is nothing but mutability of the stringBuffer object.


1.If the content is fixed and won't change frequently then we should go for string.
2.If the content is not fixed and keep on changing but Thread Safety is required then we should go
for StringBuffer.
3. If the content is not fixed and keep on changing and thread safety is not required then we should go for
StringBuilder.

















