import link.kotlin.scripts.LinkType.github
import link.kotlin.scripts.LinkType.kug
import link.kotlin.scripts.Tags
import link.kotlin.scripts.category
import link.kotlin.scripts.link
import link.kotlin.scripts.subcategory

/**
 * Instead of deleting links (since they become 404, etc) move them here.
 */
category("Archive") {
  subcategory("Libraries/Frameworks") {
    link {
      name = "Kategory/Kategory"
      desc = "Functional datatypes & abstractions for Kotlin."
      href = "https://github.com/Kategory/Kategory"
      type = github
      tags = Tags["fp", "functional", "typeclasses", "comprehensions", "lenses", "optics"]
    }
    link {
      name = "MarioAriasC/funKTionale"
      desc = "Functional constructs for Kotlin."
      href = "https://github.com/MarioAriasC/funKTionale"
      type = github
      tags = Tags["fp", "functional"]
    }
    link {
      name = "SalomonBrys/Kodein"
      desc = "Painless Kotlin Dependency Injection ."
      href = "https://github.com/SalomonBrys/Kodein"
      type = github
      tags = Tags["di", "dependency injection"]
    }
    link {
      name = "kohesive/injekt"
      desc = "(Deprecated, @see Kodein) Dependency Injection / Object Factory for Kotlin."
      href = "https://github.com/kohesive/injekt"
      type = github
      tags = Tags["di", "dependency injection"]
    }
    link {
      name = "raniejade/kspec"
      desc = "Kotlin Specification Framework."
      href = "https://github.com/raniejade/kspec"
      type = github
      tags = Tags["test", "bdd"]
    }
    link {
      name = "Levelmoney/kbuilders"
      desc = "KBuilders turns your Java builders into beautiful Type-Safe Builders."
      href = "https://github.com/Levelmoney/kbuilders"
      type = github
    }
  }
  subcategory("Kotlin User Group") {
    link {
      name = "China Kotlin User Group"
      desc = "China"
      href = "http://kotlin.cn/"
      type = kug
      tags = Tags["China"]
    }
    link {
      name = "Japan Kotlin User Group"
      desc = "Japan"
      href = "https://kotlin.doorkeeper.jp/"
      type = kug
      tags = Tags["Japan"]
    }
    link {
      name = "Kotlin Group of Boulder"
      desc = "USA"
      href = "http://www.meetup.com/Kotlin-Group-Boulder/"
      type = kug
      tags = Tags["USA"]
    }
    link {
      name = "Czech Kotlin User Group"
      desc = "Czechia"
      href = "http://kotliners.cz/"
      type = kug
      tags = Tags["Czechia", "Czech"]
    }
    link {
      name = "Kotlin.es"
      desc = "Spain"
      href = "http://kotlin.es/"
      type = kug
      tags = Tags["Spain"]
    }
  }
}
