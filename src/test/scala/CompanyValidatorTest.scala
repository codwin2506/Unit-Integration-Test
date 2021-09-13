
import org.scalatest.flatspec.AnyFlatSpec
import Company.Knoldus.Validators.CompanyValidator
import Company.Knoldus.Models.Company

class CompanyValidatorTest extends AnyFlatSpec {
  "Company Name" should "exits" in{
    val companyObject = new CompanyValidator()
    val company =new Company("Knoldus","abc@gmail.com","noida");
    assert(companyObject.companyIsValid(company)==true)
  }
}