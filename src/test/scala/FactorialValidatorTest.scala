
import Company.Knoldus.Validators.Factorial
import org.scalatest.flatspec.AnyFlatSpec
import Company.Knoldus.Validators.Factorial

class FactorialValidatorTest extends AnyFlatSpec {
  "Factorial" should "handle StackOverflowError" in {
    val fact = new Factorial()
    assert(fact.factorial(6) == 720)
    assert(fact.factorial(10) == 3628800)
    assert(fact.factorial(20) == BigInt("2432902008176640000"))
  }
}