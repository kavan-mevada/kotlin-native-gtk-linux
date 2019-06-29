# kotlin-native-gtk-linux
Sample IntelliJ project for GTK+3 using Kotlin/Native

To build use ../gradlew assemble. Do not forget to install GTK3. See bellow.

> **Info:** Work of Kotlin Gtk library in progress..

#### GTK3 Install

on Debian flavours of Linux

    sudo apt-get install libgtk-3-dev

on Fedora

    sudo dnf install gtk3-devel


If error occures shows missing file libtinfo.so.5

> **Solution:** Put "libtinfo.so.5" file to /lib64 (for 64bit) or /lib (for 32bit) folder

> **Note:** For fedora users file will be found in libncurses5-32bit-6.1-16.1.x86_64.rpm. For debian users file is in libncurses5-dev package.

#### Application Screenshot

![ScreenShot of Application](https://raw.githubusercontent.com/kavanmevada/kotlin-native-gtk-linux/master/application-screenshot.png)


## Info

Install GNOME Builder to edit layout file (builder.ui)

![ScreenShot of GNOME Builder](https://raw.githubusercontent.com/kavanmevada/kotlin-native-gtk-linux/master/builder-screenshot.png)

