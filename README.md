# Android Studio Setup & Running a Kotlin Project

## Prerequisites
| Requirement | Minimum | Recommended |
|------------|---------|-------------|
| RAM        | 4GB     | 8GB+        |
| Disk Space | 5GB     | 10GB+       |
| Java       | 11      | Latest      |

---

## Step 1: Download and Install Android Studio
1. Visit the official [Android Studio download page](https://developer.android.com/studio)
2. Download the latest version for your OS.
3. Run the installer and follow the setup wizard:
   - Select **Standard Installation**
   - Install necessary SDK components
4. Launch **Android Studio** after installation.

---

## Step 2: Install Required SDK Components
| Component | Purpose |
|-----------|---------|
| Android SDK Build-Tools | Compiles apps |
| Android Emulator | Runs virtual devices |
| Android Platform-Tools | Required for debugging |

1. Open **Android Studio**.
2. Go to **File > Settings > Appearance & Behavior > System Settings > Android SDK**.
3. Under **SDK Platforms**, install the latest **Android version**.
4. Under **SDK Tools**, ensure the above components are installed.
5. Click **Apply** and let it download necessary components.

---

## Step 3: Create or Open a Kotlin Project
### **Create a New Kotlin Project**
1. Click **New Project**.
2. Select **Empty Activity** and click **Next**.
3. Enter the **Project Name**, Package Name, and Save Location.
4. Select **Kotlin** as the language.
5. Click **Finish**.

### **Open an Existing Kotlin Project**
- Click **Open**, then select the project folder.
- OR, if using GitHub:
  ```bash
  git clone https://github.com/yourusername/project.git
  cd project
  ```
- Open the project in **Android Studio**.

---

## Step 4: Configure and Run the Kotlin Project
| Action | Steps |
|--------|-------|
| Sync Gradle | Click **"Sync Project with Gradle Files"** |
| Set Up Emulator | Open **Device Manager** → Create Virtual Device → Choose device & system image → Click **Finish** |
| Run Project | Click **Run ▶** or press `Shift + F10` |
| Select Device | Choose an emulator or connected device |

---

## Step 5: Troubleshooting
| Issue | Solution |
|-------|----------|
| Gradle Sync Issues | Click **File > Invalidate Caches & Restart** |
| Emulator Not Starting | Check if **Intel HAXM** is installed from the SDK Manager |
| Device Not Detected | Enable **USB Debugging** in developer options |

---

## Additional Resources
- [Official Android Developer Guide](https://developer.android.com/docs)
- [Kotlin Language Documentation](https://kotlinlang.org/docs/)

🚀 Now you're ready to develop Kotlin apps in Android Studio! Happy coding!
