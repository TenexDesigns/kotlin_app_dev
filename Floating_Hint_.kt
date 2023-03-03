Floating Hing for edit text


This is  a combination of TextInputLayout and Edit Text
EditText : --The hint was used as a label

TextInputLayout
  -----> WrapsEdit Text
  -----> Shows floating label when hint is hidden due to user inputting text
  -----> Shows errror i.e setErrorEnabled(boolean) This can be used to validated our users input


    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/TextInput"
        android:layout_width="328dp"
        android:layout_height="84dp">
  >

        <EditText
            android:id="@+id/Name"
            android:layout_width="335dp"
            android:layout_height="92dp"
            android:hint="FullName"
            android:inputType="textPersonName"
 />


    </com.google.android.material.textfield.TextInputLayout>
  
  
  The textInputLayout uses the text in the hint to give the user hints on what he is typing

The TextInputLayout can be used to perform validationsThis validations if true can  be used to tell the user where the elloer has occoured . Here is how


if(Name.getText().toString().isEmpy()){
  
  TextInpiyLayout.setErrorEnabled("The name can not be emplty")

}else{
  
  TextInputLayou.setErrorEnabled(false)


}



Layout which wraps a TextInputEditText, EditText, or descendant to show a floating label when the hint is hidden while the user inputs text.

Also supports:

Showing an error via setErrorEnabled(boolean) and setError(CharSequence), along with showing an error icon via setErrorIconDrawable(Drawable)
Showing helper text via setHelperTextEnabled(boolean) and setHelperText(CharSequence)
Showing placeholder text via setPlaceholderText(CharSequence)
Showing prefix text via setPrefixText(CharSequence)
Showing suffix text via setSuffixText(CharSequence)
Showing a character counter via setCounterEnabled(boolean) and setCounterMaxLength(int)
Password visibility toggling via setEndIconMode(int) API and related attribute. If set, a button is displayed to toggle between the password being displayed as plain-text or disguised, when your EditText is set to display a password.
Clearing text functionality via setEndIconMode(int) API and related attribute. If set, a button is displayed when text is present and clicking it clears the EditText field.
Showing a custom icon specified via setEndIconMode(int) API and related attribute. You should specify a drawable and content description for the icon. Optionally, you can also specify an View.OnClickListener, an TextInputLayout.OnEditTextAttachedListener and an TextInputLayout.OnEndIconChangedListener.
Note: When using an end icon, the 'end' compound drawable of the EditText will be overridden while the end icon view is visible. To ensure that any existing drawables are restored correctly, you should set those compound drawables relatively (start/end), as opposed to absolutely (left/right).

Showing a start icon via setStartIconDrawable(Drawable) API and related attribute. You should specify a content description for the icon. Optionally, you can also specify an View.OnClickListener for it.
Note: Use the setStartIconDrawable(Drawable) API in place of setting a start/left compound drawable on the EditText. When using a start icon, the 'start/left' compound drawable of the EditText will be overridden.

Showing a button that when clicked displays a dropdown menu. The selected option is displayed above the dropdown. You need to use an AutoCompleteTextView instead of a TextInputEditText as the input text child, and a Widget.MaterialComponents.TextInputLayout.(...).ExposedDropdownMenu style.
To disable user input you should set


android:editable="false"
on the AutoCompleteTextView.
The TextInputEditText class is provided to be used as the input text child of this layout. Using TextInputEditText instead of an EditText provides accessibility support for the text field and allows TextInputLayout greater control over the visual aspects of the text field. This is an example usage:


 <com.google.android.material.textfield.TextInputLayout


























