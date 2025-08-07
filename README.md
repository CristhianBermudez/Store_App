# Store App - Login Screen Implementation

## 📱 Overview
This repository contains the implementation of a login screen for the Store App, built with Android Jetpack Compose and following Material 3 design guidelines.

## ✅ Features Implemented

### Login Screen (`LoginScreen.kt`)
- **Email Input**: Text field with email keyboard type and validation
- **Password Input**: Secure text field with password masking
- **Login Button**: Full-width button to submit credentials
- **Validation System**: 
  - Empty field validation for both email and password
  - Email format validation
  - Invalid credential error messages
- **Navigation**: Redirects to dashboard on successful login

### Dashboard Screen (`DashboardScreen.kt`)
- Welcome message for successful login
- Basic dashboard content placeholder
- Logout functionality that returns to login screen

### Navigation (`AppNavigation.kt`)
- Screen routing between Login and Dashboard
- Proper back stack management
- Navigation based on authentication state

## 🧪 Testing Credentials

To test the login functionality, use these credentials:
- **Email**: `test@example.com`
- **Password**: `password123`

## 🚀 How to Run

1. Clone the repository
2. Open in Android Studio
3. Run the app on an emulator or device
4. Use the test credentials above to login

## 📋 Validation Rules

The login screen validates:
1. **Empty Fields**: Shows specific error messages for empty email/password
2. **Email Format**: Validates proper email format using Android Patterns
3. **Credentials**: Checks against hardcoded test credentials (in production this would connect to a backend)

## 🎯 Error Messages (Spanish)

- `"Por favor, ingresa tu correo y contraseña"` - Both fields empty
- `"Por favor, ingresa tu correo electrónico"` - Email field empty
- `"Por favor, ingresa tu contraseña"` - Password field empty
- `"Por favor, ingresa un correo válido"` - Invalid email format
- `"Credenciales incorrectas. Inténtalo de nuevo."` - Wrong credentials

## 🏗️ Architecture

- **UI Layer**: Jetpack Compose with Material 3
- **Navigation**: Navigation Compose
- **State Management**: Compose `remember` and `mutableStateOf`
- **Validation**: Local validation logic (extensible for backend integration)

## 📁 Project Structure

```
app/src/main/java/com/cristhiandev/store_app/
├── MainActivity.kt                 # Main entry point
├── navigation/
│   └── AppNavigation.kt           # Navigation routing
├── ui/
│   ├── login/
│   │   └── LoginScreen.kt         # Login screen implementation
│   ├── dashboard/
│   │   └── DashboardScreen.kt     # Dashboard screen
│   └── theme/                     # Material 3 theme files
└── test/
    └── ui/login/
        └── LoginValidationTest.kt # Unit tests for validation logic
```

## 🧪 Unit Tests

Run the included unit tests to verify validation logic:
```bash
./gradlew test
```

Tests cover:
- Credential validation with correct/incorrect data
- Empty field detection
- Edge cases for input validation

## 🎨 UI/UX Features

- **Material 3 Design**: Consistent with Android design guidelines
- **Responsive Layout**: Adapts to different screen sizes
- **User Feedback**: Clear error messages and visual feedback
- **Accessibility**: Proper content descriptions and keyboard navigation
- **Edge-to-Edge**: Modern Android UI with proper padding

## 🔮 Future Enhancements

- Backend integration for real authentication
- "Remember me" functionality
- Password reset flow
- Biometric authentication
- Social login options
- Enhanced email validation
- Loading states during authentication