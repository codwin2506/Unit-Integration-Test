
import org.scalatest.flatspec.AnyFlatSpec
import Company.Knoldus.Validators.PasswordValidator


class PasswordValidatorTest extends AnyFlatSpec{
  "Password_Validation" should "validate" in{
    val obj = new PasswordValidator()
    assert(obj.isValid("Knoldus432")==true)
    assert(obj.isValid("Knoldus@321")==true)
  }
}