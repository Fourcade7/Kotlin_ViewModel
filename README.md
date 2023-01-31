# Kotlin_ViewModel



      implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
      annotationProcessor 'androidx.lifecycle:lifecycle-compiler:2.2.0'
      
      
      
      View with XAML view logic only

      ViewModel which handles click handlers and creating new view models. Handles routed events etc.

      Model which is my data container and business logic regarding validating the model data.

      Services which populate the model with data. Eg call a web server, load it from disk, save to disk etc. Depending on the example often both my model       and service will implement IPropertyChanged. Or they may have event handlers instead.

      Any complex application imo needs another layer. I call it model + service, view, viewmodel. The service abstracts your business logic and takes a         model instance as a dependency or creates a model.
      
    
      
      
![1_z3_p6gvk7411V2i2KRgDMQ](https://user-images.githubusercontent.com/60017090/197410128-5e426971-9ccd-4436-a279-97056ad8e828.png)
![1_CEW0JrVST7ReQq04j0P0kw](https://user-images.githubusercontent.com/60017090/197410140-5f86b8a1-64a7-4e34-88f4-aebb0beae898.png)
![mvp-vs-mvc-vs-mvvm-vs-viper-comparison3](https://user-images.githubusercontent.com/60017090/197410150-7f658d4f-b898-4c56-8515-551d461b907e.jpg)
![MVVM-for-Android-App-Development](https://user-images.githubusercontent.com/60017090/197410169-03346a66-319c-420b-8f2b-ca083bf99eae.png)
![1_6YYuni9J8nDNjMAYh1TIAQ](https://user-images.githubusercontent.com/60017090/197410177-9a49cdfb-6661-4459-808d-be89b69ca2a8.jpeg)
![1_jfsg6f0GiogCY37SnjJcXw](https://user-images.githubusercontent.com/60017090/197410181-cb688dd4-177a-4341-ab75-50c8be8d27ee.png)
