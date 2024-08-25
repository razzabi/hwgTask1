@main @registerMelaka
  Feature: Register new member in Melaka

    @successRegisterNewMember
    Scenario: Success register new member
      Given user access melaka register dashboard
      When user on register page user input valid name "Fakhriyani"
      And user input phone number "87880084500"
      And user input business name "Kobim"
      And user choose business type
      And user input email "fanybroto@gmail.com"
      And user input password "qatesting01"
      And user input password confirmation "qatesting01"
      And user click tnc checkbox
      And user click button regsiter
      Then user will get information about activation account "Aktivasi Akun"

    @displayFieldErrorMessage
    Scenario: Display error message under the field
      Given user access melaka register dashboard
      When user on register page user click field name without input the name
      And user click field phone number without input number
      And user click field business name without input business name
      And user click field email without input email
      And user click field password without input password
      And user click field confirm password without input confirm password
      And user click tnc checkbox
      Then display error message under field name "Wajib diisi."
      Then display error message under field phone number "Wajib diisi. Nomor telepon tidak boleh kurang dari 10 atau lebih dari 12 karakter."
      Then display error message under field business name "Wajib diisi."
      Then display error message under field email "Wajib diisi."
      Then display error message under field password "Wajib diisi."
      Then display error message under field confirm password "Wajib diisi."

    @displayPhoneNumberErrorMessageLess
    Scenario: Display error message phone number field less than 10 characters
      Given user access melaka register dashboard
      When user on register page user input valid name "Fakhriyani"
      And user input phone number "878800845"
      And user click field business name without input business name
      Then display error message under field phone number "Wajib diisi. Nomor telepon tidak boleh kurang dari 10 atau lebih dari 12 karakter."

    @displayPhoneNumberErrorMessageMore
    Scenario: Display error message phone number field more than 12 characters
      Given user access melaka register dashboard
      When user on register page user input valid name "Fakhriyani"
      And user input phone number "87880084500123"
      And user click field business name without input business name
      Then display error message under field phone number "Wajib diisi. Nomor telepon tidak boleh kurang dari 10 atau lebih dari 12 karakter."

    @displayPasswordErrorMessageLess
    Scenario: Display error message password field less than 8 characters
      Given user access melaka register dashboard
      When user on register page user input valid name "Fakhriyani"
      And user input password "test1"
      And user click field confirm password without input confirm password
      Then display error message under field password "Min. 8 karakter, harus kombinasi dari huruf dan angka."

    @displayConfirmPasswordErrorMessage
    Scenario: Display error message confirmation password field if the input is different with password
      Given user access melaka register dashboard
      When user on register page user input valid name "Fakhriyani"
      And user input password "qatesting01"
      And user input password confirmation "testing01"
      And user click tnc checkbox
      Then display error message under field confirm password "Belum sesuai dengan kata sandi."

    @displayFormatEmailErrorMessage
    Scenario: Display an error message if the email format is incorrect.
      Given user access melaka register dashboard
      When user on register page user input valid name "Fakhriyani"
      And user input email "fanybroto"
      And user click field password without input password
      Then display error message under field email "Harap isi dengan format yang benar."
