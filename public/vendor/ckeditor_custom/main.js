import {
  DecoupledEditor,
  Autoformat,
  Bold,
  Italic,
  Strikethrough,
  Underline,
  BlockQuote,
  Essentials,
  FontBackgroundColor,
  FontColor,
  FontFamily,
  FontSize,
  Heading,
  Image,
  ImageCaption,
  ImageResize,
  ImageStyle,
  ImageToolbar,
  ImageUpload,
  ImageResizeHandles,
  ImageResizeEditing,
  Base64UploadAdapter,
  Link,
  List,
  Mention,
  PageBreak,
  PasteFromOffice,
  StandardEditingMode,
  Table,
  TableCaption,
  TableCellProperties,
  TableColumnResize,
  TableProperties,
  TableToolbar,
  TextTransformation,
  GeneralHtmlSupport,
  Alignment,
} from "ckeditor5";

import { IndentFirst } from "custom-plugins/src/indent-first/index.js";
import { ParagraphSpacing } from "custom-plugins/src/paragraph-style/spacing/index.js";
import { LineHeight } from "custom-plugins/src/paragraph-style/line-height/index.js";

const editorConfig = {
  toolbar: {
    items: [
      "undo",
      "redo",
      "|",
      "selectAll",
      "|",
      "bold",
      "italic",
      "|",
      "link",
      "|",
      "accessibilityHelp",
    ],
    shouldNotGroupWhenFull: false,
  },
  plugins: [
    Alignment,
    Autoformat,
    BlockQuote,
    Bold,
    Base64UploadAdapter,
    Essentials,
    FontBackgroundColor,
    FontColor,
    FontFamily,
    FontSize,
    Heading,
    Image,
    ImageCaption,
    ImageResize,
    ImageResizeHandles,
    ImageResizeEditing,
    ImageStyle,
    ImageToolbar,
    ImageUpload,
    Italic,
    Link,
    List,
    Mention,
    PageBreak,
    PasteFromOffice,
    StandardEditingMode,
    Strikethrough,
    Table,
    TableCaption,
    TableCellProperties,
    TableColumnResize,
    TableProperties,
    TableToolbar,
    TextTransformation,
    Underline,
    IndentFirst,
    ParagraphSpacing,
    LineHeight,

    GeneralHtmlSupport,
  ],
  initialData: "",
  link: {
    addTargetToExternalLinks: true,
    defaultProtocol: "https://",
    decorators: {
      toggleDownloadable: {
        mode: "manual",
        label: "Downloadable",
        attributes: {
          download: "file",
        },
      },
    },
  },
  htmlSupport: {
    allow: [
      {
        name: /.*/,
        attributes: true,
        classes: true,
        styles: true,
      },
    ],
  },
};

DecoupledEditor.create(document.querySelector("#editor"), editorConfig).then(
  (editor) => {
    window.editor = editor;
    return editor;
  }
);
