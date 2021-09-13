
import org.scalatest.flatspec.AnyFlatSpec
import Company.Knoldus.Validators.PalindromeValidator

class PalindromeValidatorTest extends AnyFlatSpec {
  "Palindrome" should "valid" in {
    val palindrome= new PalindromeValidator()
    assert(palindrome.is_palindrome(75257) == true)
    assert(palindrome.is_palindrome(1211) == false)
    assert(palindrome.is_palindrome(121) == true)
  }

}