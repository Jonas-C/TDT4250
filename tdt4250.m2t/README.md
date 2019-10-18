# Assignment 3 - TDT4250
This is the repo containing the model-to-text code needed to complete assignment 3.

## The code
The transformation code can be found in *src/tdt4250.m2t.main* in the HTMLGenerator.mtl file.
The transformation is done using Acceleo.

## Changes made to the model from assignment 1.
I was originally planning on not making any changes to my original model. 
This led to several problems during the development of this third assignment.
Originally, a Semester had four references to Course, one for mandatory courses, one for electives, one for m2a and one for m1a.
I never really found a way to pass these references (collected in an OrderedSet) to a function, which in turn led to bad code.

By doing it this way I also couldn't figure out how to do if statements. They threw an error message no matter what, and Google 
didn't really have any helpful answers. 

This led to me removing the course references and making a new class, SemesterCourse.
This class contains a reference to a course, and an attribute specifying the status of the course: Obligatory, elective, m2a or m1a.

Semestercourse now stores all courses in an OrderedSet which contains semester courses.

## How to run
Since the transformation uses Acceleo, this has to be installed first. While in Eclipse, this can be done by going to
*Help -> Eclipse Marketplace.. -> Search Acceleo -> Install.

After this has been done, right click the HTMLGenerator.mtl file described above, then hover over "Run As" and then select "Launch Acceleo Project".
If this doesn't work you're gonna have to alter the run configuration. This can be done by right clicking HTMLGenerator.mtl,
hover "Run As" and then selecting "Run Configurations..". The following configuration should work:
* **Project:** tdt4250.m2t
* **Main Class:** tdt4250.m2t.main.HTMLGenerator
* **Model:** /org.eclipse.NTNU.studymodel/model/Department.xmi
* **Target:** /tdt4250.m2t/test

After this has been added, click apply and then you should be good to go. Run the file as described above.
The output should be in the "test"-folder in tdt4250.m2t.

## Something to note

As of today I suddenly started experiencing a lot of unexplained Eclipse crashes whenever handling the project(s). No error messages
are given, Eclipse just closes instantly. After googling what's being written to the log file I'm not any wiser. I managed to (mostly) 
bypass it by editing the ECore model in the Ecore Model Editor instead of the Sample Ecore Model editor. However, weird stuff is still
happening.
