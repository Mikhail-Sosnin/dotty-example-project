import mill._, scalalib._

object root extends SbtModule {
  def millSourcePath = ammonite.ops.pwd
  def scalaVersion = "0.18.1-RC1"
  def publishVersion = "0.1.0"
}