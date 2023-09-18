# Learn-Android-ViewModel-by-UseCases
This repository contains multiple android projects. Each Android project represents a special usecase of Android ViewModel. 
We could just start learning by describing what **ViewModel** is but the purpose of this repository is to observe different use cases of **Android ViewModel**.

## **[SampleProject1](https://github.com/gobinda1547/Learn-Android-ViewModel-by-Use-Cases/tree/master/SampleProject1)**
This project proves that by default, data realated to **Activity** or **Fragment**, doesn't survive configuration changes(such as Screen rotation, Display size change, Locale change, etc).
  
The main idea of this project is to show a random number in a text view. Also there will be a button, and if user press on the button, then the previous random number will be changed.
Initially when the **Activity** will be created then there will be no random number. Now after changing the random number by clicking on the button, we will perform a configuration change 
on the activity. Then we will found that the random number that was shown in the textview previously has gone (Means it doesn't survive configuration change).


## **[SampleProject2](https://github.com/gobinda1547/Learn-Android-ViewModel-by-Use-Cases/tree/master/SampleProject2)**
This project is a simple example of how we can restore data by using **SavedInstanceState/Bundle** when an **Activity** gets restored due to configuration changes.
  
The main idea of this project is same to **SampleProject1**. Here we will also show a random number in a text view and by clicking on the button, the random number will be changed.
However when making a configuration change we will store our random number in **SavedInstanceState**, so that it could survive. And when the activity will be restored, then again
we will reinitialize the random number by getting it from the **SavedInstanceState**.


## **[SampleProject3](https://github.com/gobinda1547/Learn-Android-ViewModel-by-Use-Cases/tree/master/SampleProject3)**
This project is a simple example of how we can restore data by using **ViewModel** when an **Activity** gets restored due to configuration changes.
This project also shows how we should declare our **ViewModel** in **Activity** scope.
  
The main idea of this project matched exactly with **SampleProject1** and **SampleProject2**. However in **SampleProject2** we restored the data using **ViewModel**.
We also declared the **ViewModel** in **Activity** scope. Meaning - Our ViewModel will only be destroyed when the attached Activity will be completely destroyed. If
the Activity is temporary destroyed (means - there is a chance that activity will be restored), then our viewmodel won't be destroyed.


## **[SampleProject4](https://github.com/gobinda1547/Learn-Android-ViewModel-by-Use-Cases/tree/master/SampleProject4)**
This project shows how we should declare our **ViewModel** in **Fragment** scope.
  
The main idea of this project is slightly different than previous examples, cause now we are dealing with **Fragments**. Here we will show the random number in the textview, but there will 
be 2 button. 1st one is for changing the random number and 2nd one will be for replacing the fragment in the activity. Now while showing a random number, if we change the configuration then
our random number will survive, since we have added our **ViewModel** in **Fragment** scope and the Fragment is not completely destroyed. But if we click the **Replace Fragment** button then
a new fragment will be replaced in place of our old Fragment. In this scenario, our old fragment will be destroyed completely, as well as our old viewmodel will also be destroyed.


## **[SampleProject5](https://github.com/gobinda1547/Learn-Android-ViewModel-by-Use-Cases/tree/master/SampleProject5)**
This project explains the concept of **Shared ViewModel**. Meaning, you will use **ViewModel** in your **Fragment** class but you will attach the **ViewModel** in **Activity** scope.
  
Sometimes we may need to communicate between 2 fragment, We can easily perform that by using **Shared ViewModel** concept. In that case, we have to declare our **ViewModel** in **Activity** 
scope but we will use the ViewModel from Fragments, And then until the activity gets destroyed our viewmodel will be there. Also when **FragmentA** or **FragmentB** will request for the 
**ViewModel** object, both of them will have the same object's reference. This project idea matched exactly with the project idea of **SampleProject4**. However when you will click the 
**Replace Fragment** button then a new Fragment will be shown by replacing the previous one, but the random number will be the same, cause the viewmodel is old as it is attached in 
activity scope.


## **[SampleProject6](https://github.com/gobinda1547/Learn-Android-ViewModel-by-Use-Cases/tree/master/SampleProject6)**
This project demonstrate how to use **ViewModel** with **Hilt** dependency injection library and in **Activity** scope.

The main idea of this project is a little bit different, cause now we are trying to show a random number by getting it from the server. The server request is mocked in repository class
with 5 seconds delay. Now if you click on the **Next** button for changing the random number, then it will gets changed after 5 seconds. And if you click on the next button, then after
1 second you changed phone orientation then still after 1 + 4 seconds, a new random number will be displayed, cause the random number downloading part is handled in ViewModel and it's
the old one.




