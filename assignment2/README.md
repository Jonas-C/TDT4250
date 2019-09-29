# TDT4250 - Assignment 2 - OSGi

## Intro

This repo contains the OSGi project created for assignment 2, where we were to get to know how OSGi works.


## How to run

Running the project is done in a very similar way to the example project. Once you run application using the launch.bndrun file from the servlet folder
the servlet can be found on http://localhost:8080/conversion/. By appending something to the URL the conversion will show on the page.
Example url:
http://localhost:8080/conversion/CelToFah?q=30


There's also gogo-functionality. These are the commands that are currently supported:

**list** -    show all available conversions. Conversions added from the gogo shell are marked with a \* at the end of their name.

**add**  -    Add a conversion. Syntax: *Add {Conversion Expression} {Preferred From Identifier} {Preferred To Identifier}*

**remove** -  Removes a conversion. Syntax: *Remove {Conversion Name}*

**convert** - Converts a value to another value. Syntax: *convert {Convertion Name} {Value}*

## Structure

**tdt4250.conversion.api** - The Conversion interface and Search classes.

**tdt4250.conversion.celToFah** - Convertion component for converting between Celsius and Fahrenheit.

**tdt4250.conversion.fahToCel** - The above, only opposite.

**tdt4250.conversion.gogo** - Code relating to gogo shell commands.

**tdt4250.conversion.kgToPound** - Another Convertion component.

**tdt4250.conversion.KmToMile**  - Yet another Convertion component.

**tdt4250.conversion.servlet** - Web servlet.

**tdt4250.conversion.util** - Contains an implementation for the Conversion interface. Converts values and creates conversions.
