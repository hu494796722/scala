package chapter06

object Test06_16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("huzc", "123")
    user.insert()
  }
}


class User(val name: String, val password: String)

trait UserDao {
  // 特质的类型注入
  _: User =>

  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}


  // 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao