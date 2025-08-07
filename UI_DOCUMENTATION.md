# UI Component Documentation

## Login Screen Components

### LoginScreen.kt Features:

1. **Header Section**
   - Title: "Iniciar Sesión" (32sp, Bold)
   - Centered alignment

2. **Input Fields**
   - Email field with email icon and "Correo electrónico" label
   - Password field with lock icon and "Contraseña" label
   - Both fields use OutlinedTextField with Material 3 styling
   - Proper keyboard types (Email/Password)
   - Keyboard actions (Next/Done)

3. **Validation & Error Handling**
   - Real-time error clearing when user types
   - Specific error messages for different validation failures
   - Error text displayed in Material 3 error color

4. **Login Button**
   - Full width button
   - "Iniciar sesión" text
   - 50dp height for better touch target

## Dashboard Screen Components

### DashboardScreen.kt Features:

1. **Welcome Section**
   - "¡Bienvenido!" title (32sp, Bold)
   - Success message confirming login

2. **Content Card**
   - Material 3 Card with elevation
   - Dashboard placeholder content
   - Explains this is the main app content area

3. **Logout Button**
   - OutlinedButton style
   - Exit icon with "Cerrar sesión" text
   - Full width for consistency

## Navigation Flow

```
LoginScreen → (successful login) → DashboardScreen
     ↑                                      ↓
     ← ← ← ← ← (logout) ← ← ← ← ← ← ← ← ← ← ←
```

## Material 3 Design Elements Used

- **Colors**: Primary, Error, Surface colors from theme
- **Typography**: Various text sizes (16sp, 18sp, 24sp, 32sp)
- **Spacing**: Consistent 8dp, 16dp, 24dp, 32dp spacing
- **Icons**: Material Icons (Email, Lock, ExitToApp)
- **Components**: OutlinedTextField, Button, OutlinedButton, Card, Text
- **Layout**: Column with proper alignment and arrangement

## Responsive Design

- Uses `fillMaxSize()` and `fillMaxWidth()` for responsive layout
- Proper padding (24dp) for comfortable touch targets
- Vertical arrangement with appropriate spacing
- Horizontal centering for better visual balance