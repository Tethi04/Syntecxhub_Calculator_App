<div align="center">

  # 🌸 Pastel Glassmorphic Calculator 🌸
  
  *An aesthetically pleasing, soft pastel glassmorphic calculator application built for Web and Native Android.*

  [![Live Demo](https://img.shields.io/badge/Live-Demo_Link-cyan?style=for-the-badge&logo=github)](https://tethi04.github.io/Syntecxhub_Calculator_App/)
  [![GitHub stars](https://img.shields.io/github/stars/Tethi04/Syntecxhub_Calculator_App?style=for-the-badge&color=purple)](https://github.com/Tethi04/Syntecxhub_Calculator_App)
  [![License](https://img.shields.io/badge/License-MIT-pink?style=for-the-badge)](LICENSE)

  <br />

  <!-- App Screenshot Preview -->
<img width="1079" height="2047" alt="Image" src="https://github.com/user-attachments/assets/a92cd932-85a4-433d-b97b-959409eca7c1" alt="Pastel Glassmorphic Calculator Preview" width="320" style="border-radius: 24px; box-shadow: 0 15px 35px rgba(0,0,0,0.15);" />
</div>

---

## 📖 Table of Contents
- [✨ Overview](#-overview)
- [🎨 Design Concept](#-design-concept)
- [⚡ Key Features](#-key-features)
- [📂 Comprehensive Project Structure](#-comprehensive-project-structure)
- [🌐 Live Demo & Web Deployment](#-live-demo--web-deployment)
- [🛠️ Detailed Step-by-Step Installation Guide](#️-detailed-step-by-step-installation-guide)
  - [1. Web Edition Setup](#1-web-edition-setup)
  - [2. Android Native Setup](#2-android-native-setup)
- [🧮 How to Use / Calculator Functions](#-how-to-use--calculator-functions)
- [💻 Tech Stack](#-tech-stack)
- [👩‍💻 Author](#-author)

---

## ✨ Overview

**Pastel Glassmorphic Calculator** is a fully functional arithmetic calculator application designed with a strong focus on modern UI/UX aesthetics. Built with two separate codebases—one for **Web browsers** and another for **Native Android devices**—it brings a soothing pastel aesthetic paired with frosted glass visuals to everyday calculations.

Whether viewed on a mobile screen, tablet, or desktop browser, the interface seamlessly adapts while maintaining fluid visual elements like glowing 3D spheres, soft blur effects, and smooth button press feedback.

---

## 🎨 Design Concept

The visual identity of this app relies on **Glassmorphic UI Design**:
- **Frosted Translucent Container:** Uses `backdrop-filter: blur()` on Web and custom semi-transparent shapes on Android to simulate real frosted glass.
- **Pastel Mesh Background:** A soft, multi-layered color gradient shifting smoothly between Cyan (`#A5F3FC`), Soft Purple (`#C084FC`), and Pastel Pink (`#F472B6`).
- **Ambient 3D Orbs:** Layered background spheres with radial gradients that generate realistic lighting, depth, and glass refraction effects behind the main container.

---

## ⚡ Key Features

- 🔮 **Glassmorphism Visual Style:** High-quality frosted translucent panels with bright white borders.
- 🎨 **Aesthetic Color Scheme:** Soft pastel tones carefully picked for high readability and visual comfort.
- 📱 **Cross-Platform Availability:**
  - **Web App:** Hosted on GitHub Pages with zero external dependencies.
  - **Android Native App:** Built with Kotlin using Material Components and custom vector drawables.
- 🧮 **Complete Arithmetic Support:**
  - Core Operations: Addition (`+`), Subtraction (`-`), Multiplication (`×`), Division (`÷`).
  - Quick Utilities: Percentage (`%`), Sign Toggle (`±`), Clear All (`C`).
- 💎 **Interactive Enter Button:** Highlighted cyan glass key providing visual emphasis for calculation results.
- 📐 **Responsive & Adaptive:** Automatically scales layouts across various smartphone, tablet, and desktop display sizes.

---

## 📂 Comprehensive Project Structure

Here is an exact breakdown of every file in this repository and its role:

```text
Syntecxhub_Calculator_App/
│
├── app/                                  # Android Native Application Folder
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/pastelglasscalculator/
│   │       │   └── MainActivity.kt    # Kotlin logic for UI interaction & calculation
│   │       │
│   │       └── res/                   # Android Resources (Layouts, Styles, Vectors)
│   │           ├── drawable/          # Custom XML Graphics & Glass Shapes
│   │           │   ├── bg_pastel_gradient.xml # Main background gradient
│   │           │   ├── bg_orb_glass.xml       # Top-left frosted glass orb
│   │           │   ├── bg_orb_pink.xml        # Accent pink orb shape
│   │           │   ├── bg_orb_cyan.xml        # Bottom-right cyan orb shape
│   │           │   ├── bg_glass_button.xml    # Regular glass button layout
│   │           │   ├── bg_enter_button.xml    # Highlighted Cyan Enter key layout
│   │           │   └── bg_dot.xml             # Top-left window control dots
│   │           │
│   │           ├── layout/
│   │           │   └── activity_main.xml  # Main UI layout structure
│   │           │
│   │           └── values/
│   │               ├── colors.xml         # All color palette hex codes
│   │               └── styles.xml         # Reusable button & typography styles
│   │
│   └── build.gradle                      # Android build configuration script
│
├── docs/                                 # GitHub Pages Deployment Directory
│   └── index.html                        # Self-contained Web Edition (HTML + CSS + JS)
│
├── preview.png                           # Screenshot preview for documentation
└── README.md                             # Project documentation file
```

---

## 🌐 Live Demo & Web Deployment

You can test the Web Edition live without installing anything:  
🔗 **[Launch Pastel Glassmorphic Calculator](https://tethi04.github.io/Syntecxhub_Calculator_App/)**

---

## 🛠️ Detailed Step-by-Step Installation Guide

### 1. Web Edition Setup
*No compiler or heavy setup required.*

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Tethi04/Syntecxhub_Calculator_App.git](https://github.com/Tethi04/Syntecxhub_Calculator_App.git)
   ```
2. **Open the project folder:**
   ```bash
   cd Syntecxhub_Calculator_App
   ```
3. **Launch in browser:**  
   Navigate to the `docs/` folder and double-click `index.html` to open it in any browser (Chrome, Edge, Firefox, Safari).

---

### 2. Android Native Setup
*Requirements: Android Studio (Ladybug / Jellyfish or newer) & JDK 17+.*

1. **Clone or Download the Repository:**
   ```bash
   git clone [https://github.com/Tethi04/Syntecxhub_Calculator_App.git](https://github.com/Tethi04/Syntecxhub_Calculator_App.git)
   ```
2. **Open in Android Studio:**
   - Launch Android Studio.
   - Select **Open** and choose the cloned `Syntecxhub_Calculator_App` root folder.
3. **Sync Project:**  
   Wait for Gradle to finish downloading dependencies and syncing project files automatically.
4. **Run the App:**  
   - Select your Android Virtual Device (Emulator) or connect your physical Android phone via USB debugging.
   - Click the green **Run (▶)** button or press `Shift + F10`.

---

## 🧮 How to Use / Calculator Functions

| Key | Function | Explanation |
| :---: | :---: | :--- |
| **`C`** | Clear | Resets the current display and stored calculation back to zero. |
| **`±`** | Toggle Sign | Flips the current entry between positive and negative value. |
| **`%`** | Percentage | Converts the number into a percentage value. |
| **`÷`, `×`, `−`, `+`** | Arithmetic Operators | Executes standard division, multiplication, subtraction, and addition. |
| **`Enter`** | Evaluate | Calculates and displays the final result on the screen. |

---

## 💻 Tech Stack

- **Web Application:** HTML5, CSS3 (Modern Flexbox, CSS Grid, Custom Backdrop Filters), JavaScript (Vanilla ES6+)
- **Android Native App:** Kotlin, XML Layouts, Material Design Components 3
- **Design Paradigm:** Glassmorphism, Pastel Visual Architecture

---

## 👩‍💻 Author

**Tethi Biswas**  
- GitHub: [@Tethi04](https://github.com/Tethi04)  

---

<div align="center">
  <i>Crafted with 💖, attention to detail, and modern design principles.</i>
</div>
