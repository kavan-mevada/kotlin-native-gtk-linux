# kotlinnative-gtk-linux
Sample IntelliJ project for GTK+3 using Kotlin/Native

To build use ../gradlew assemble. Do not forget to install GTK3. See bellow.

#### GTK3 Install

on Debian flavours of Linux

    sudo apt-get install libgtk-3-dev

on Fedora

    sudo dnf install gtk3-devel


If error occures shows missing file libtinfo.so.5

> **Solution:** Put "libtinfo.so.5" file to /lib64 (for 64bit) or /lib (for 32bit) folder

> **Note:** For fedora users file will be found in libncurses5-32bit-6.1-16.1.x86_64.rpm. For debian users file is in libncurses5-dev package.
