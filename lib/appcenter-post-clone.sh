#!/usr/bin/env bash

# Add your Flutter build scripts here
flutter pub get
# flutter build ios --release --no-codesign
flutter build apk --release
